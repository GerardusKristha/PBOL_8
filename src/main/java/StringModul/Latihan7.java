package StringModul;

import java.util.Scanner;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Latihan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Firstname: ");
        StringBuffer input  = new StringBuffer(sc.next()).append(" ");
        System.out.print("Middlename: ");
        input.append(sc.next()).append(" ");
        System.out.print("Lastname: ");
        input.append(sc.next());
        System.out.println("Fullname: "+input);
        
    }
}
