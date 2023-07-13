package terceiroDesafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int k = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            for (int i : numbers) {
                if (number - i == k) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
