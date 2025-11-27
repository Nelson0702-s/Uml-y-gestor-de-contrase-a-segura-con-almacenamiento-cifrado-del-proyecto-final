package com.proyectofinal15;

import java.util.List;
import java.util.Scanner;

/**
 * Clase que muestra el menú en consola.
 */
public class MenuConsola {
    private final GestorContrasenias gestor;
    private final Scanner scanner;

    public MenuConsola(GestorContrasenias gestor) {
        this.gestor = gestor;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Mostrar el menú principal por consola.
     */
    public void mostrarMenu() {
        int opcion = 0;

        do {
            System.out.println("=== Menú de Contraseñas ===");
            System.out.println("1. Crear contraseña nueva");
            System.out.println("2. Listar todas las contraseñas");
            System.out.println("3. Generar PDF de usuarios");
            System.out.println("4. Generar PDF de contraseñas fuertes");
            System.out.println("5. Generar PDF de reportes");
            System.out.println("6. Abrir interfaz gráfica");
            System.out.println("7. Salir");
            System.out.print("Seleccione opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch(opcion) {
                case 1 -> {
                    System.out.print("Ingrese nombre de usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String pass = scanner.nextLine();
                    gestor.agregarContrasenia(nombre, pass);
                }
                case 2 -> {
                    List<Usuario> usuarios = gestor.getUsuarios();
                    for (Usuario u : usuarios) {
                        System.out.println("Usuario: " + u.getNombre() + " - Contraseña: " + u.getContrasena());
                    }
                }
                case 3 -> {
                    gestor.generarPDF("Usuarios.pdf", gestor.getUsuarios());
                    System.out.println("PDF de usuarios generado.");
                }
                case 4 -> {
                    gestor.generarPDF("ContraseñasFuertes.pdf", gestor.getContrasenasFuertes());
                    System.out.println("PDF de contraseñas fuertes generado.");
                }
                case 5 -> {
                    gestor.generarPDF("Reportes.pdf", gestor.getReportes());
                    System.out.println("PDF de reportes generado.");
                }
                case 6 -> {
                    InterfazGrafica ventana = new InterfazGrafica(gestor);
                    ventana.setVisible(true);
                }
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while(opcion != 7);
    }
}
