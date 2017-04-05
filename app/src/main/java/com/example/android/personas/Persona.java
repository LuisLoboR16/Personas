package com.example.android.personas;

/**
 * Created by android on 04/04/2017.
 */

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String pasatiempos;

    public Persona(String apellido, String nombre, int edad, String pasatiempos) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.pasatiempos = pasatiempos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPasatiempos() {
        return pasatiempos;
    }

    public void setPasatiempos(String pasatiempos) {
        this.pasatiempos = pasatiempos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
