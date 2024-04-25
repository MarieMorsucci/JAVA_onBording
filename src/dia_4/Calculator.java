package dia_4;

import java.util.Scanner;

public class Calculator {
    Scanner prompt= new Scanner(System.in);

    Menu menu =new MenuImpl();
    Operations operations = new OperationsImpl();

//    public void showMenu(){
//        this.menu.watchMenu();
//    }









    public boolean selectionOption(int num1,int num2){

        System.out.println("Ingrese una opcion de calculo");
        int aux= prompt.nextInt();

        switch (aux) {
            case 1:
                System.out.println("RESULTADO: " + operations.addition(num1, num2));
                System.out.println("""
                
                OPERACION EXITOSO
                
                
                """);
                return true;
            case 2:
                System.out.println("RESULTADO: " + operations.subtraction(num1, num2));
                System.out.println("""
                
                OPERACION EXITOSO
                
                
                """);
                return true;

            case 3:
                System.out.println("RESULTADO: " + operations.multiplication(num1, num2));
                System.out.println("""
                
                OPERACION EXITOSO
                
                
                """);
                return true;

            case 4:
                System.out.println("RESULTADO: " + operations.division(num1, num2));
                System.out.println("""
                
                OPERACION EXITOSO
                
                
                """);
                return true;

            default:
                System.out.println("Opción Invalida --> Salir del Calculador");
                return false;
        }




    }

}
