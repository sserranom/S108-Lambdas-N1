package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        PiValue piProvider = () -> 3.1415;

        System.out.println("El valor de Pi es: " + piProvider.getPiValue());
    }
}
