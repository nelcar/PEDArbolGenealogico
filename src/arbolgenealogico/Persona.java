/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arbolgenealogico;

/**
 *
 * @author Inspiron
 */
public class Persona {
    private String nombre;
    private String segundoNombre;
    private String apellidos;
    private String añoNacimiento;
    private String fechaCumpleaños;
    private String descripcion;

    public Persona() {
    }

    public Persona(String nombre, String segundoNombre, String apellidos, String añoNacimiento, String fechaCumpleaños, String descripcion) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellidos = apellidos;
        this.añoNacimiento = añoNacimiento;
        this.fechaCumpleaños = fechaCumpleaños;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public void setFechaCumpleaños(String fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
    
    
}
