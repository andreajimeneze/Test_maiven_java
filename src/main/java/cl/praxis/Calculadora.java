package cl.praxis;

public class Calculadora {

    public int suma(int a, int b) {
       int suma = a + b;
       return suma;
    }

    public int resta(int a, int b) {
        int resta = a - b;
        return resta;
    }

    public int multiplicacion(int a, int b){
        int multiplicacion = a * b;
        return multiplicacion;
    }

    public float division(int a, int b) {

        if(b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        float division = (float) a / b;
        return division;
    }


}
