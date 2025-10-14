package ar.edu.unlu.poo.labo2.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private double poder;
    private String tipo;

    public Artefacto(String nombre, double poder, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getNivelDePoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nombre.equals(((Artefacto) obj).getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public double compare(Object obj1, Object obj2) {
        double a1 = ((Artefacto) obj1).getNivelDePoder();
        double a2 = ((Artefacto) obj2).getNivelDePoder();

        return Double.compare(a1, a2);
    }
}
