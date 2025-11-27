package com.proyectofinal15;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Interfaz gráfica principal de la aplicación.
 */
public class InterfazGrafica extends JFrame {

    private final GestorContrasenias gestor;

    public InterfazGrafica(GestorContrasenias gestor) {
        this.gestor = gestor;
        inicializarVentana();
    }

    /**
     * Inicializa la ventana principal.
     */
    private void inicializarVentana() {
        setTitle("Gestor de Contraseñas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Logo
        JLabel logo = new JLabel(new ImageIcon("logo.png"));
        logo.setHorizontalAlignment(JLabel.CENTER);
        panel.add(logo, BorderLayout.NORTH);

        // Área de texto para mostrar usuarios
        JTextArea areaTexto = new JTextArea();
        JScrollPane scroll = new JScrollPane(areaTexto);
        panel.add(scroll, BorderLayout.CENTER);

        // Botón para mostrar usuarios
        JButton btnMostrar = new JButton("Mostrar Usuarios");
        btnMostrar.addActionListener(e -> {
            List<Usuario> usuarios = gestor.getUsuarios();
            areaTexto.setText("");
            for (Usuario u : usuarios) {
                areaTexto.append(u.getNombre() + " - " + u.getContrasena() + "\n");
            }
        });
        panel.add(btnMostrar, BorderLayout.SOUTH);

        add(panel);
    }
}
