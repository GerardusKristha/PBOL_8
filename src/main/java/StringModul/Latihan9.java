package StringModul;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Latihan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah kalimat : ");
        String sentence = sc.nextLine();
        
        StringTokenizer tokens = new StringTokenizer(sentence);
        
        System.out.println("Kalimat anda terdiri dari kata-kata berikut ini: ");
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
