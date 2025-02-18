package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        StringReverser reverser = input -> new StringBuilder(input).reverse().toString();

        String originalString = "It Academy";
        String reversed = reverser.reverse(originalString);

        System.out.println("Frase Original: " + originalString);
        System.out.println("Frase invertida: " + reversed);
    }
}
