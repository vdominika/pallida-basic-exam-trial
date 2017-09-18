import java.util.Arrays;
import java.util.Scanner;

public class OddFilter {
    public static void main(String[] args) {

//        Scanner scanner = new scanner(System.in);

        List<Integer> objList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.print("The even numbers in the list ");

        objList.stream().filter(i -> i % 2 == 0).distinct().forEach(i -> System.out.print(" " + i));
    }
}
