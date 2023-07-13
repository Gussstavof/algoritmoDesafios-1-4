package quartoDesafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int size = word.length();

        String str1 = word.subSequence(size/2, size).toString();
        String str2 = word.subSequence(0, size/2).toString();

        String result = new StringBuilder(str2).reverse()
                .append(new StringBuilder(str1).reverse())
                .toString();
        System.out.println(result);
    }
}
