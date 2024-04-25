package dia_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mascota mascota1= new Mascota("Pepito",TipoMascota.PESCADO,2);
        Mascota mascota2= new Mascota("Milo",TipoMascota.PERRO,3);
        Mascota mascota3= new Mascota("Falu",TipoMascota.GATO,3);

    Persona persona1 =new Persona(false,1.67,34,"33333333","Lopez","Mariela");
    Persona persona2=new Persona(true,1.80,39,"62222289","Gomez","Mario");

    persona1.agregarMascota(mascota3);
    persona1.agregarMascota(mascota2);
    persona2.agregarMascota(mascota1);

    System.out.println(persona1.saludar());
    System.out.println(persona2.saludar());


    System.out.println(mascota2);

    }










}
