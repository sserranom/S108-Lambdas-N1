package Ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class Months {

    public static List<String> monthsFilterWhithO(List<String> lista) {
        return lista.stream()
                .filter(month -> month.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}

