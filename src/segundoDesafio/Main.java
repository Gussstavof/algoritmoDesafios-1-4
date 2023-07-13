package segundoDesafio;

import java.math.BigDecimal;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal value = new BigDecimal(sc.next());
        int i = 0;
        int count = 0;
        List<BigDecimal> numbers =
                Arrays.asList(
                        new BigDecimal("100.00"), new BigDecimal("50.00"),
                        new BigDecimal("20.00"), new BigDecimal("10.00"),
                        new BigDecimal("5.00"), new BigDecimal("2.00"),
                        new BigDecimal("1.00"), new BigDecimal("0.50"),
                        new BigDecimal("0.25"), new BigDecimal("0.10"),
                        new BigDecimal("0.05"), new BigDecimal("0.01"),
                        new BigDecimal("0.00"));


        SortedMap<BigDecimal, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        do{
            if (value.doubleValue() >= numbers.get(i).doubleValue()){
                value = value.subtract(numbers.get(i));
                count++;
            }
            else {
                map.put(numbers.get(i), count);
                count = 0;
                i++;
            }
        }while (!Objects.equals(numbers.get(i), new BigDecimal("0.00")));

        System.out.println("Notas: ");
        map.forEach((key, result) -> {
            if (key.doubleValue() >= 2.00){
                System.out.println(result + " nota(s) de R$ " + key);
            }
        });
        System.out.println("Moedas: ");
        map.forEach((key, result) -> {
            if (key.doubleValue() < 2.00){
                System.out.println(result + " moeda(s) de R$ " + key);
            }
        });
    }
}
