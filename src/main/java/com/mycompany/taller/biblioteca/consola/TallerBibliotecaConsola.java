/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller.biblioteca.consola;


import java.util.Scanner;

public class TallerBibliotecaConsola {




    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
      
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de la Biblioteca ---");
            System.out.println("1. Pedir libro prestado");
            System.out.println("2. Devolver libro");
            System.out.println("3. Crear usuario");
            System.out.println("4. Agregar libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
/*
            switch (opcion) {
                case 1:
                    biblioteca.prestarLibro(scanner);
                    break;
                case 2:
                    biblioteca.devolverLibro(scanner);
                    break;
                case 3:
                    biblioteca.crearUsuario(scanner);
                    break;
                case 4:
                    biblioteca.agregarLibro(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }*/
        } while (opcion != 5);

        scanner.close();
    }
}