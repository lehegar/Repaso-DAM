package Biblioteca;

public class Libro {

    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;

    // CONSTRUCTOR
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = true;
    }

    // GETTERS Y SETTERS

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

   public void setAutor(String autor) {
    this.autor = autor;
    }
 

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // MÉTODO
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
    }
}