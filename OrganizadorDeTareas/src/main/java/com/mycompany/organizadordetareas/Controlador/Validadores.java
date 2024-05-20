/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.organizadordetareas.Controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class Validadores {
    public boolean validarHora(String cad) {
        String patron = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cad);
        return matcher.matches();
    }

    public boolean validarFecha(String cad) {
        String patron = "^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cad);
        return matcher.matches();
    }
}
