package Ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class Months {

    public static List<String> filterMonths(List<String>lista) {
        return lista.stream()
                .filter(month -> month.toLowerCase().contains("o") && month.length()>5)
                .collect(Collectors.toList());
    }
}

