package dia_4;

public class OperationsImpl implements Operations{


    @Override
    public int addition(int num1, int num2) {

        return num1+num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int division(int num1, int num2) {

        if(num2!=0){
        return num1/num2;
        }else{
        System.out.println("La operación solicitada no puede realizarse.DIVISOR CERO DA COMO RESULTADO UN NUMERO INFINITO");
        return 999999999;
        }
    }

}