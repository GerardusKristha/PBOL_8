package StringModul;

import java.util.Scanner;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Latihan6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.next();
        String result = input.replaceAll("a", "4")
                .replaceAll("i", "1")
                .replaceAll("u", "11")
                .replaceAll("e", "3")
                .replaceAll("o", "0");
        System.out.println("Output: " + result);
    }
}
