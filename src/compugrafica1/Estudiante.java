/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compugrafica1;

/**
 *
 * @author andres_david.londono
 */
public class Estudiante {
    private String Nombre;
    private String Codigo;

    public Estudiante(String nombre, String codigo) {
        this.Nombre = nombre;
        this.Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
}
