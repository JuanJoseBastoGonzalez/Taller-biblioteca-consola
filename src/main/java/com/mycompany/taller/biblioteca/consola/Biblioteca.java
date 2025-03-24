package com.mycompany.taller.biblioteca.consola;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Libro> libros;
    private static Biblioteca instancia;
    
    public Biblioteca() {
        usuarios = new ArrayList<>();
        libros = new ArrayList<>();
    }

    public static Biblioteca getInstancia() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }
    
    public Usuario buscarUsuario(int documento) {
        return usuarios.stream()
                      .filter(u -> u.getDocumento() == documento)
                      .findFirst()
                      .orElse(null);
    }

    public Libro buscarLibro(int id) {
        return libros.stream()
                     .filter(l -> l.get_identificador() == id)
                     .findFirst()
                     .orElse(null);
    }

    public boolean crearUsuario(String nombre, int documento) {
        if (buscarUsuario(documento) != null) {
            JOptionPane.showMessageDialog(null, "Error: El usuario ya existe.");
            return false;
        }
        usuarios.add(new Usuario(nombre, documento));
        return true;
    }
    
    public boolean agregarLibro(String titulo, String autor, int id) {
        if (buscarLibro(id) != null) {
            JOptionPane.showMessageDialog(null, "Error: El libro ya existe.");
            return false;
        }
        libros.add(new Libro(titulo, autor, id));
        return true;
    }

    public void prestarLibro(int documentoUsuario, int idLibro) {
        Usuario usuario = buscarUsuario(documentoUsuario);
        if (usuario == null) {
            int respuesta = JOptionPane.showConfirmDialog(null, 
                    "Usuario no encontrado. ¿Desea crear el usuario?",
                    "Error", 
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                new CrearUsuario().setVisible(true); // Abre ventana CrearUsuario
            }
            return;
        }

        Libro libro = buscarLibro(idLibro);
        if (libro == null) {
            int respuesta = JOptionPane.showConfirmDialog(null, 
                    "Libro no encontrado. ¿Desea agregar el libro?",
                    "Error", 
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                new CrearLibro().setVisible(true); // Abre ventana CrearLibro
            }
            return;
        }

        if (!libro.is_esta_prestado()) {
            libro.prestar();
            usuario.agregarLibroPrestado(libro.get_identificador());
            JOptionPane.showMessageDialog(null, "Libro prestado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El libro ya está prestado.");
        }
    }

    public void devolverLibro(int documentoUsuario, int idLibro) {
        Usuario usuario = buscarUsuario(documentoUsuario);
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            return;
        }

        Libro libro = buscarLibro(idLibro);
        if (libro == null) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
            return;
        }

        if (usuario.getIdentificador_libros_prestados().contains(idLibro)) {
            libro.devolver();
            usuario.devolverLibroPrestado(idLibro);
            JOptionPane.showMessageDialog(null, "Libro devuelto exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no tiene este libro prestado.");
        }
    }
    
    // Métodos adicionales para las ventanas
    public void abrirVentanaPrestarLibro() {
        new PrestarLibro().setVisible(true);
    }
    
    public void abrirVentanaDevolverLibro() {
        new DevolverLibro().setVisible(true);
    }
    
    // Getters para las listas (pueden ser útiles para las ventanas)
    public ArrayList<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios); // Devuelve copia para evitar modificación directa
    }
    
    public ArrayList<Libro> getLibros() {
        return new ArrayList<>(libros); // Devuelve copia para evitar modificación directa
    }
}