package Ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Noviembe", "Diciembre");

        System.out.println("******Imprimimos la lista con una lambda*******");
        months.forEach(month -> System.out.println(month));
        //months.forEach(System.out::println);
    }

}