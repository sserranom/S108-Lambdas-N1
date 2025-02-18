package Ejercicio7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        List<Object> myList = Arrays.asList(11, 5, 8, "python", 90, "Java", 50, "php", "sql", 80, "c#");

        List<String> sortedStrings = myList.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());


        List<Number> sortedNumbers = myList.stream()
                .filter(item -> item instanceof Number)
                .map(item -> (Number) item)
                .sorted(Comparator.comparingDouble(Number::doubleValue).reversed())
                .collect(Collectors.toList());

        System.out.println("\n*******IMPRIMIMOS LAS CADENAS DE LA MAS LARGA A LA MAS CORTA Y LOS NUMEROS DE MAYOR A MENOR*******");
        sortedStrings.forEach(System.out::println);
        sortedNumbers.forEach(System.out::println);
    }
}

