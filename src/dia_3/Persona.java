package dia_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double altura;
    private boolean casado;
    List<Mascota> mascotas = new ArrayList<>();



    public Persona() {
    }

    public Persona(List<Mascota> mascotas, boolean casado, double altura, int edad, String dni, String apellido, String nombre) {
        this.mascotas = mascotas;
        this.casado = casado;
        this.altura = altura;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Persona(boolean casado, double altura, int edad, String dni, String apellido, String nombre) {

        this.casado = casado;
        this.altura = altura;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
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

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
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
                ", mascotas=" + mascotas +
                '}';
    }

    public String saludar() {
        return "Hola!!! Soy " + nombre + " " + apellido + ", mi documento de identidad es " + dni + ", tengo " + edad + " años y mido " + altura + " metros. Estoy " + (casado? "casado": "soltero")+ " y mis mascotas son: "
                +mascotas;
    }

public void agregarMascota(Mascota mascota){
    mascota.setDuenio(this);
    mascotas.add(mascota);
}






}
