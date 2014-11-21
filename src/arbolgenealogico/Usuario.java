package arbolgenealogico;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombre;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
