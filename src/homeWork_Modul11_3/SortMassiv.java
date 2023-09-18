package homeWork_Modul11_3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMassiv {
    public static void main(String[] args) {
        String [] strings = {"1, 2, 0", "4, 5"};
        int[] sortedArray = sortMas(strings);
        String result = Arrays.stream(sortedArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("\"" + result + "\"");
    }
    public static int [] sortMas (String [] string) {

        String stroki = String.join(", ", string);
        String[] numbers = stroki.split(", ");

        int[] intArray = Stream.of(numbers)
                .map(s -> Integer.parseInt(s))
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        return intArray;
    }

}
