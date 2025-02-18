package Ejercicio1;

import java.util.Arrays;
import java.util.List;

import static Ejercicio1.Months.monthsFilterWhithO;

public class Main {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Noviembe", "Diciembre");

        System.out.println("*******Meses que contienen la letra 'o'*******");
        Months.monthsFilterWhithO(months)
                .forEach(System.out::println);

    }

}