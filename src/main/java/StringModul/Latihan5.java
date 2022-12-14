package StringModul;

import java.util.Scanner;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = sc.next();
        String result = input.replaceAll("[aiueo]","#");
        System.out.println("Output: "+result);
    }
}
