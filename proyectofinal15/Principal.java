/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectofinal15;

/**
 * Clase principal que inicia la aplicación.
 */
public class Principal {
    public static void main(String[] args) {
        // Crear el gestor de contraseñas
        GestorContrasenias gestor = new GestorContrasenias();

        // Crear y mostrar el menú de consola
        MenuConsola menu = new MenuConsola(gestor);
        menu.mostrarMenu();
    }
}
