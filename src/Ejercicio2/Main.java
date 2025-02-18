package Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Noviembe", "Diciembre");

        System.out.println("*******Meses que contienen la letra 'o' y tienen mas de 5 letras*******");
        Months.filterMonths(months)
                .forEach(System.out::println);



    }

}