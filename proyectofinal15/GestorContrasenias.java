package com.proyectofinal15;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona usuarios y contraseñas.
 * Permite agregar, listar, generar reportes y PDFs.
 */
public class GestorContrasenias {

    private final List<Usuario> usuarios;

    public GestorContrasenias() {
        usuarios = new ArrayList<>();
    }

    /**
     * Agregar un nuevo usuario con su contraseña.
     * @param nombre
     * @param contrasena
     */
    public void agregarContrasenia(String nombre, String contrasena) {
        usuarios.add(new Usuario(nombre, contrasena));
    }

    /**
     * Obtener lista de usuarios.
     * @return Lista de usuarios.
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Obtener contraseñas fuertes.
     * @return Lista de usuarios con contraseñas fuertes.
     */
    public List<Usuario> getContrasenasFuertes() {
        List<Usuario> fuertes = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u.getContrasena().length() >= 8) { // Ejemplo simple
                fuertes.add(u);
            }
        }
        return fuertes;
    }

    /**
     * Obtener reportes (simples).
     * @return 
     */
    public List<Usuario> getReportes() {
        return usuarios;
    }

    /**
     * Método para generar PDF usando PDFBox o iText (ejemplo).
     * @param nombreArchivo Nombre del PDF.
     * @param lista
     */
    public void generarPDF(String nombreArchivo, List<Usuario> lista) {
        // Aquí se implementa la generación de PDF
        // Se puede usar Apache PDFBox o iText
    }
}
