/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.biblioteca.consola;


public abstract class Recurso {
    private String titulo;
    private String autor;
    private int identificador;
    private String date_loan;
    private boolean esta_prestado;

    // Constructor
    public Recurso(String titulo, String autor, int identificador) {
        this.titulo = titulo;
        this.autor = autor;
        this.identificador = identificador;
        this.esta_prestado = false; // Por defecto, no está prestado
    }

    // Getters y Setters
    public String get_titulo() {
        return titulo;
    }

    public void set_titulo(String titulo) {
        this.titulo = titulo;
    }

    public String get_autor() {
        return autor;
    }

    public void set_autor(String autor) {
        this.autor = autor;
    }

    public int get_identificador() {
        return identificador;
    }

    public void set_identificador(int identificador) {
        this.identificador = identificador;
    }

    public String get_date_loan() {
        return date_loan;
    }

    public void set_date_loan(String date_loan) {
        this.date_loan = date_loan;
    }

    public boolean is_esta_prestado() {
        return esta_prestado;
    }

    public void set_esta_prestado(boolean esta_prestado) {
        this.esta_prestado = esta_prestado;
    }

    // Métodos abstractos
    public abstract void prestar();
    public abstract void devolver();
}