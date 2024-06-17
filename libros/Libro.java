package libros;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private String fecha;

    // método constructor
    public Libro(String titulo, String autor, String fecha){
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    // MÉTODOS DE TIPO GET (OBTENER)
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getFecha() {
        return fecha;
    }

    // MÉTODOS DE TIPO SET (ESTABLECER)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha " + fecha;
    }
}
