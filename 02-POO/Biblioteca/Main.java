package Biblioteca;

public class Main {
    

    
    Biblioteca biblioteca1 = new Biblioteca();

    Libro libro1 = new Libro("1984", "George Orwell", 1949);
    Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
    Libro libro3 = new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", 1997);
    Libro libro4 = new Libro("El Señor de los Anillos", "J. R. R. Tolkien", 1954);


    biblioteca.anadirLibro(libro1);
    biblioteca.anadirLibro(libro2);
    biblioteca.anadirLibro(libro3);
    biblioteca.anadirLibro(libro4);


    biblioteca.mostrarLibros();

    biblioteca.prestarLibro("El Quijote");

    biblioteca.mostrarLibros();


    biblioteca.devolverLibro("El Quijote");

    biblioteca.mostrarLibros();





  
     
}
