package com.proyectofinal15;

/**
 * Clase que representa un usuario y su contraseña.
 */
public class Usuario {
    private String nombre;
    private String contrasena;

    /**
     * Constructor de Usuario.
     * @param nombre Nombre del usuario.
     * @param contrasena Contraseña del usuario.
     */
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
