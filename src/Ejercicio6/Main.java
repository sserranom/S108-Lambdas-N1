package Ejercicio6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Object> myList = Arrays.asList(11,5, 8, "mysql", 90, "java", 50, "python", "sql", 80);


        List<String> sortedStrings = myList.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());


        List<Number> sortedNumbers = myList.stream()
                .filter(item -> item instanceof Number)
                .map(item -> (Number) item)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\n*******IMPRIMIMOS LAS CADENAS DE LA MAS CORTA A LA MAS LARGA Y LOS NUMEROS DE MENOR A MAYOR*******");
        sortedStrings.forEach(System.out::println);
        sortedNumbers.forEach(System.out::println);
    }
}
