package Ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Noviembe", "Diciembre");

        System.out.println("******Imprimimos la lista con una lambda utilizando el metodo de referencia*******");

        months.forEach(System.out::println);
    }

}