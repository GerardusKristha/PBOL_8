package StringModul;

import java.util.Scanner;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Latihan8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input kata: ");
        StringBuffer word = new StringBuffer(sc.next());
        System.out.print("Reverse kata: " + word.reverse());
        String status;
        if(word.toString().equals(word.reverse().toString())){
              status = "Palindrome";      
        }else
            status = "Bukan Palindrome";
        System.out.println("\nStatus: "+status);
    }
}
