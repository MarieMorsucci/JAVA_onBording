package dia_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner prompt= new Scanner(System.in);
    Calculator calculator=new Calculator();


    boolean aux=true;

    do {

        System.out.println("Ingrese primer número");
        int num1= prompt.nextInt();
        System.out.println("Ingrese segundo número");
        int num2 = prompt.nextInt();

        calculator.menu.watchMenu();
        aux= calculator.selectionOption(num1,num2);


    }while(aux);













    }
}
