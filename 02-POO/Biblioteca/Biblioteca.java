package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void anadirLibro(Libro nuevoLibro) {
        libros.add(nuevoLibro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (titulo.equals(libro.getTitulo())) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Libro prestado correctamente.");
                } else {
                    System.out.println("El libro ya está prestado.");
                }
                return;
            }
        }
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (titulo.equals(libro.getTitulo())) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("Libro devuelto correctamente.");
                } else {
                    System.out.println("El libro ya estaba disponible.");
                }
                return;
            }
        }
    }

    public void buscarPorAutor(String autor) {

        boolean encontrado = false;

        for (Libro libro : libros) {
            if (autor.equals(libro.getAutor())) {
                encontrado = true;
                libro.mostrarInfo();
            }
        }

        if (!encontrado) {
            System.out.println("El autor no está disponible.");
        }
    }
}