package dia_1;

import dia_2.classes.Persona;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.util.HashSet.newHashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner prompt = new Scanner(System.in);
//        1. Crea las variables correspondientes para leer tu nombre, apellido y edad e imprímelas en la consola en una oración.
//
//        String nombre = "Mariela";
//        String apellido = "Morsucci";
//
//        System.out.println(nombre + " " + apellido);

//        2. Cree un método que imprima un mensaje de bienvenida en la consola.

//        String mensaje = "Hola!! Espero tengas un hermoso día";
////
//        saludar(mensaje);

//        3. Crea un pequeño programa que te permita ingresar 3 números e imprimir a través de la consola cuál es el más grande.

//        System.out.println("Escriba numero 1");
//        Byte num1 = prompt.nextByte();
//        System.out.println("Escriba numero 2");
//        Byte num2 = prompt.nextByte();
//        System.out.println("Escriba numero 3");
//        Byte num3 = prompt.nextByte();
//
//        compare(num1, num2, num3);


//        4.  Crea un pequeño programa que te permita ingresar un número e imprimir a través de la consola si es par o impar.

//        System.out.println("Ingrese un número");
//        Byte num= prompt.nextByte();
//
//        if(num%2==0){
//            System.out.println("Este número es par");
//        }else{
//            System.out.println("Este número es impar");
//        }


//
//        5. Crea el código correspondiente que te permite ingresar 2 cadenas de caracteres e imprimir vía consola si son iguales o no.

//        System.out.println("Ingrese una palabra");
//        String palabra1 = prompt.next();
//
//        System.out.println("Ingrese otra palabra");
//        String palabra2 = prompt.next();
//
//        if(palabra1.equals(palabra2)){
//            System.out.println("Las palabras son iguales");
//
//        }else{
//            System.out.println("Las palabras NO SON IGUALES");
        //       }

//        6. Cree un método que reciba un número y devuelva si es primo o no.


//        System.out.println("Ingrese número para saber si es primo");
//        int numero = prompt.nextInt();
//
//        if (esPrimo(numero)) {
//            System.out.println(numero + " es primo");
//        } else {
//            System.out.println(numero + " no es primo");
//        }


//        7. Cree un método que reciba una matriz de números y devuelva la suma de los números impares.

//        System.out.println("Ingrese cinco numeros");
//
//        int[] numeros= new int [5];
//
//        for (int i = 0; i < numeros.length; i++) {
//
//            System.out.println("Ingresa un numero para la posición "+i);
//            numeros[i]= prompt.nextInt();
//        }
//
//        int rta=sumaImpares(numeros);
//
//        System.out.println("La suma de numero impares es " +rta );


//        8. Cree un método que reciba una matriz de números e imprima los números pares y la suma de los números primos.

        int[] numeros = new int[6];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un numero para la posición " + i);
            numeros[i]=prompt.nextInt();
        }

        String pares = "Estos numeros son pares:  ";
        String primosCadena = "Estos numeros son primos:  ";
        int[] sonpares = pares(numeros);
        int[] sonprimos = primos(numeros);

        for (int i = 0; i < sonpares.length; i++) {

            if (sonpares[i] != 0) {
                pares = pares + sonpares[i] + ", ";
            }

        }
        System.out.println(pares);


        for (int i = 0; i < sonprimos.length; i++) {
            primosCadena = primosCadena + sonprimos[i] + ", ";

        }
        System.out.println(primosCadena);


//
//        9. Crear un método que imprima un pequeño menú a través de la consola con las opciones básicas de una calculadora, agregando la opción 0 para salir de ella.
//        10. Crea otro método que retome el punto anterior para poder crear una pequeña calculadora usando switch. Tenga en cuenta el caso de división por 0.


//        System.out.println("Ingrese un numero");
//        Integer num1= new Integer(prompt.nextInt());
//
//        System.out.println("Ingrese otro numero");
//        Integer num2=new Integer (prompt.nextInt());
//
//        System.out.println("Ingrese un operador:1.Suma/ 2.Resta /3.Multiplicacion / 4.Division ");
//        Integer op=new Integer (prompt.nextInt());
//
//
//       calcular(num1,num2,op);


//        11. Crear el algoritmo necesario para poder gestionar la entrada a una boleteria. Debería tener un pequeño menú con las siguientes opciones:
//
//                Entrada de datos.
//
//                Capacidad disponible.
//
//                Dinero recaudado.
//
//                Cerrar sesión en el sistema

//       12. Crear las variables correspondientes para controlar el aforo y el dinero recaudado.//
//
//        La capacidad máxima es de 500 personas.
//
//                La entrada costará 1500 por persona y 2000 la entrada VIP.
//
//                La primera opción del menú deberá tomar los datos personales del participante (nombre, edad, DNI y pase).
//
//                El algoritmo debe detectar si la persona es apta para el ingreso, ya que solo se permitirá el ingreso a mayores de 21 años.
//
//                Consulta antes de cobrar la entrada si tienes un pase VIP con el que entrarás gratis o si tienes un pase con descuento que sólo te permitirá pagar la
//                mitad del valor de la entrada.
//
//        En el momento del pago deberás preguntar si quieres comprar la entrada normal o VIP y finalmente darles la bienvenida si todo ha ido bien, volviendo al menú principal.

//        int optIngreso;
//        int precioComun = 1500;
//        int precioVip = 2000;
//        int capacidad = 500;
//       double recaudacion = 0;
//
//
//        do {
//            System.out.println("Qué desea hacer? \n 1.Entrada de datos \n 2.Capacidad disponible \n 3.Dinero recaudado \n 4. Cerrar sesión en el sistema");
//            optIngreso = prompt.nextInt();
//
//            switch (optIngreso) {
//                case 1:
//                    ingresarDatos(capacidad, precioComun, precioVip, recaudacion, prompt);
//                    break;
//                case 2:
//
//
//                    System.out.println("Quedan aún " + capacidad + " diponibles");
//                    break;
//                case 3:
//                    System.out.println("Se ha recaudado " + recaudacion + " pesos en entradas vendidas");
//                    break;
//                case 4:
//                    System.out.println("Desea cerrar sesion en el sistema? 1.Si/2.No");
//                    int rta = prompt.nextInt();
//                    if (rta == 1) {
//                        optIngreso = 4;
//                        break;
//                    } else {
//                        optIngreso = 1;
//                    }
//
//            }
//
//
//        } while (optIngreso != 4);


    }



    public static void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    ;

    public static void compare(Byte num1, Byte num2, Byte num3) {

        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("El numero mayor es " + num2);
            } else System.out.println("El numero mayor es " + num3);
        } else if (num1 > num3) {
            System.out.println("El numero mayor es " + num1);
        } else {
            System.out.println("El numero mayor es " + num3);
        }
    }

    ;

    public static Boolean esPrimo(int[] numero) {

        boolean esPrimo = true;


        for (int i = 2; i <= numero.len / 2; i++) {

            int resto;
            resto = numero % i;
            System.out.println(numero + " dividido " + i + " da el resto " + resto);

            if (resto == 0) {
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }

    ;

    public static int sumaImpares(int[] numeros) {
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                aux = aux + numeros[i];
            }
        }
        return aux;
    }


    public static int[] pares(int[] numeros) {

        int[] auxPar = new int[numeros.length];


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                auxPar[i] = numeros[i];
            }
        }

        return auxPar;
    }

    public static int[] primos(int[] numeros) {

        int[] auxPar = new int[numeros.length];

        boolean esPrimo = true;


        for (int i = 2; i <= numero.len / 2; i++) {

            int resto;
            resto = numero % i;
            System.out.println(numero + " dividido " + i + " da el resto " + resto);

            if (resto == 0) {
                esPrimo = false;
                break;
            }
        }

        return auxPar;
    }










    public static void calcular(Integer num1, Integer num2, Integer op) {
        Integer rdo = new Integer(0);

        switch (op) {
            case 1:
                rdo = num2 + num1;
                System.out.println("La operación solicitada dio como resultado " + rdo);
                break;
            case 2:
                rdo = num2 - num1;
                System.out.println("La operación solicitada dio como resultado " + rdo);
                break;
            case 3:
                rdo = num2 * num1;
                System.out.println("La operación solicitada dio como resultado " + rdo);
                break;
            case 4:

                if (num1 == 0) {
                    System.out.println("La división no puede realizarse");
                    break;
                } else {
                    rdo = num2 / num1;
                    System.out.println("La operación solicitada dio como resultado " + rdo);
                    break;

                }

        }

    }


    public static void ingresarDatos(int capacidad, int precioComun, int precioVip, double recaudacion, Scanner prompt){
        int entrada=0;
        int cantidad=0;

        System.out.println("Ingrese un nombre");
        String nombre= prompt.next();

        System.out.println("Ingrese edad");
        int edad= prompt.nextInt();

        System.out.println("Ingrese DNI");
        String dni= prompt.next();

        System.out.println("Ingrese si tiene un tipo de pase: 1.VIP // 2.Con Descuento // 3.No tengo ningún tipo de pase");
        int tipoPase= prompt.nextInt();

        if (edad<21){
            System.out.println("La cdmpra no puede realizarse por ser la persona menor de edad");
        }else{

            if (tipoPase==1){
                capacidad--;

                System.out.println("DISFRUTA LA PELI!");

            }else if(tipoPase==2){
                System.out.println("Que entrada desea comprar? 1.Común//2.VIP");
                entrada=prompt.nextInt();
                System.out.println("Indique cuantas entradas");
                cantidad=prompt.nextInt();



                if(entrada==1){
                    capacidad--;
                    recaudacion = recaudacion+precioComun*cantidad*0.5;
                    System.out.println("COMPRA EXITOSA");
                }else {
                    capacidad--;
                    recaudacion = recaudacion+0.5*precioVip*cantidad;
                    System.out.println("COMPRA EXITOSA");

                }

            }else{
                System.out.println("Que entrada desea comprar? 1.Común//2.VIP");
                entrada=prompt.nextInt();
                System.out.println("Indique cuantas entradas");
                cantidad=prompt.nextInt();

                if(entrada==1){
                    capacidad--;
                    recaudacion= recaudacion+precioComun*cantidad;
                    System.out.println("COMPRA EXITOSA");
                }else {
                    capacidad--;
                    recaudacion= recaudacion+precioVip*cantidad;
                    System.out.println("COMPRA EXITOSA");

                }

            }


        }


    }


















}
