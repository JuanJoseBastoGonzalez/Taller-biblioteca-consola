/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.biblioteca.consola;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int documento;
    private boolean tiene_prestamos;
    private ArrayList<Integer> identificador_libros_prestados;

    // Constructor
    public Usuario(String nombre, int documento) {
        this.nombre = nombre;
        this.documento = documento;
        this.tiene_prestamos = false;
        this.identificador_libros_prestados = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public boolean isTiene_prestamos() {
        return tiene_prestamos;
    }

    public ArrayList<Integer> getIdentificador_libros_prestados() {
        return identificador_libros_prestados;
    }

    // Método para agregar un libro prestado
    public void agregarLibroPrestado(int idLibro) {
        this.identificador_libros_prestados.add(idLibro);
        this.tiene_prestamos = true;
    }

    // Método para devolver un libro prestado
    public void devolverLibroPrestado(int idLibro) {
        this.identificador_libros_prestados.remove(Integer.valueOf(idLibro));
        if (this.identificador_libros_prestados.isEmpty()) {
            this.tiene_prestamos = false;
        }
    }

    // Método para mostrar detalles del usuario
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Tiene préstamos: " + (tiene_prestamos ? "Sí" : "No"));
        System.out.println("Libros prestados: " + identificador_libros_prestados);
    }
}