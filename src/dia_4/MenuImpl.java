package dia_4;

public class MenuImpl implements Menu {

    @Override
    public void watchMenu() { System.out.println(createOptions());  }

    private String createOptions(){
        //ASI APARECE O SE VISUALIZA
        return """
                Menu Calculadora
                1. Suma --> num1+num2
                2. Resta --> num1-num2
                3. Multiplicación --> num1*num2
                4. División --> num1/num2
                
                5-9.Salir
                
                """;
    }




}
