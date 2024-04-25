package dia_2.classes;

import java.util.Arrays;

public class Persona {

    public String[] mascotas;
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double altura;
    private boolean casado;



    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, int edad, double altura, boolean casado, String[] mascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
        this.mascotas = mascotas;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(String[] mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", casado=" + casado +
                ", mascotas=" + Arrays.toString(mascotas) +
                '}';
    }

    public String saludar() {
        return "Hola!!! Soy " + nombre + " " + apellido + ", mi documento de identidad es " + dni + ", tengo " + edad + " años y mido " + altura + " metros. Estoy " + (casado? "casado": "soltero")+ " y mis mascotas son: "
                + Arrays.toString(mascotas) ;
    }








}
