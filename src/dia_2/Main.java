package dia_2;

import dia_2.classes.Persona;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNombre("Mariela");
        persona1.setApellido("Lopez");
        persona1.setAltura(1.67);
        persona1.setCasado(false);
        persona1.setDni("15999999");
        persona1.setEdad(35);
        //INCORPORACION A UN ARREGLO
        String[] nuevo = {"Lolita", "Antu", "Falu"};
        persona1.setMascotas(nuevo);


        persona2.setNombre("Danie");
        persona2.setApellido("Lopez");
        persona2.setAltura(1.80);
        persona2.setCasado(true);
        persona2.setDni("16999999");
        persona2.setEdad(37);
        //INCOR2ORACION A UN ARREGLO
        String[] nuevo2 = {"Pepe", "Pipo", "Pablo"};
        persona2.setMascotas(nuevo2);


        System.out.println(persona1.saludar());
        System.out.println(persona2.saludar());


    }


}
