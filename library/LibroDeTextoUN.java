package library;

public class LibroDeTextoUN extends LibroDeTexto {
    private String facultad;

    public LibroDeTextoUN(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Facultad: " + facultad);
    }
}
