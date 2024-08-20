package library;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos y llamadas a métodos para demostrar el ejercicio
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes");
        libro.setPrecio(19.99);
        libro.imprimirDetalles();

        LibroDeTexto libroDeTexto = new LibroDeTexto("Matematicas", "John Doe", "Algebra");
        libroDeTexto.setPrecio(25.99);
        libroDeTexto.imprimirDetalles();

        LibroDeTextoUN libroDeTextoUN = new LibroDeTextoUN("Fisica", "Jane Doe", "Mecanica", "Facultad de Ciencias");
        libroDeTextoUN.setPrecio(35.99);
        libroDeTextoUN.imprimirDetalles();

        Novela novela = new Novela("1984", "George Orwell", "Ciencia Ficción");
        novela.setPrecio(15.99);
        novela.imprimirDetalles();
    }
}
