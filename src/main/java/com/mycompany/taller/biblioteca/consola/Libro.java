/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.biblioteca.consola;


public class Libro extends Recurso {

    // Constructor
    public Libro(String titulo, String autor, int identificador) {
        super(titulo, autor, identificador);
    }

    // Implementación del método prestar
    @Override
    public void prestar() {
        if (!is_esta_prestado()) { // Verificar si el libro no está prestado
            set_esta_prestado(true); // Marcar como prestado
            set_date_loan("2023-10-25"); // Aquí puedes usar una fecha real o un sistema de fechas
            System.out.println("Libro prestado: " + get_titulo());
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    // Implementación del método devolver
    @Override
    public void devolver() {
        if (is_esta_prestado()) { // Verificar si el libro está prestado
            set_esta_prestado(false); // Marcar como no prestado
            set_date_loan(null); // Limpiar la fecha de préstamo
            System.out.println("Libro devuelto: " + get_titulo());
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    // Método para mostrar detalles del libro
    public void mostrarDetalles() {
        System.out.println("Libro: " + get_titulo());
        System.out.println("Autor: " + get_autor());
        System.out.println("ID: " + get_identificador());
        System.out.println("Estado: " + (is_esta_prestado() ? "Prestado" : "Disponible"));
        System.out.println("Fecha de préstamo: " + get_date_loan());
    }
}