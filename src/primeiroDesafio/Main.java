package primeiroDesafio;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            numbers.add(scanner.nextInt());
        }

        numbers = numbers.stream()
                .sorted(Integer::compareTo).toList();

       evenNumbers(numbers);
       oddNumbers(numbers);

    }

    public static void evenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2==0)
                .forEach(System.out::println);
    }

    public static void oddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

}
