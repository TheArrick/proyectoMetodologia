/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.organizadordetareas.Controlador;


import com.mycompany.organizadordetareas.Modelo.Escritor;
import java.util.ArrayList;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;


public class GestorUser{
    private ArrayList<Usuario> users;
    private boolean creado;
    private Escritor escritor;
    private final String[]preguntas = { "¿Cuál es tu animal favorito?",
                                        "¿Cuál es tu color favorito?" ,
                                        "¿En qué ciudad naciste?" ,
                                        "¿Cuál es tu marca favorita" ,
                                        "¿Cuál es tu pelicula favorita?" };

    public GestorUser(){
        users = new ArrayList();
        creado = false;
        escritor = new Escritor("BaseUsuarios.txt");

        //gestor lee su base de datos y los usuarios no se pierden
        ArrayList<String[]> base = escritor.leerTodo();
        for(int i = 0; i<base.size();i++){
            String nom = base.get(i)[0];
            String cont = base.get(i)[1];
            String res = base.get(i)[2];
            int ind = Integer.parseInt(base.get(i)[3]);
            
            Usuario us = new Usuario(nom,cont,res,ind);

            creado = true;
            registrarUsuario(us);
            creado = false;
        }
    }
    
    public String getPreguntaEnPos(int pos){
        return preguntas[pos];
    }

    public boolean registrarUsuario(Usuario user){
        boolean flag = false;
        if(validarUsuario(user)){
            users.add(user);
            flag = true;
            if(!creado){
                File file;
                try {
                    Files.createDirectories(user.getDirAs());
                } catch (IOException e) {
                    System.err.println("Error al crear la carpeta: " + e.getMessage());
                }
                escritor.escribir(user.toString());
            }

        }
        return flag;
    }

    private boolean validarUsuario(Usuario user){
        boolean flag = false;
        if(buscarUsuarioNom(user.getNombre()) == null){
            flag = true;
        }
        return flag;
    }

    public Usuario buscarUsuario(String nombUser, String pass){
        Usuario us = null;
        for(Usuario usuario : users){
            if(usuario.getNombre().equals(nombUser)){
                if(usuario.getContra().equals(pass)){
                    us = usuario;
                    break;
                }
            }
        }
        return us;
    }
    

    public Usuario buscarUsuarioNom(String nombUser){
        Usuario us = null;
        for(Usuario usuario : users){
            if(usuario.getNombre().equals(nombUser)){
                us = usuario;
                break;

            }
        }
        return us;
    }

    public void eliminarUsuario(Usuario usuario) { 
        File carpetaUsuario = new File(usuario.toStringDirAs());
        if (carpetaUsuario.exists()) {
            borrarDirectorio(carpetaUsuario);
        }
        users.remove(usuario);
        escritor.eliminar(usuario.toString());
    }

    private void borrarDirectorio(File directorio) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    borrarDirectorio(archivo);
                }
            }
        }
        directorio.delete();
    }
    
    public boolean verificarRecuperacion(String nombre, String res){
        Usuario us = buscarUsuarioNom(nombre);
        boolean flag = false;
        if(us != null){
            if(us.getRespuesta().equals(res)){
                flag = true;
            }
        }
        return flag;
    }
    
    public void modificarContraseña(String nombre, String contraNueva){
        Usuario us = buscarUsuarioNom(nombre);
        escritor.eliminar(us.toString());
        us.setContrasena(contraNueva);
        escritor.escribir(us.toString());
    }
}

