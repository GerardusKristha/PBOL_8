package StringModul;

import java.util.Scanner;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Karakter-1 : ");
        String k1 = input.next();
        System.out.print("Karakter-2 : ");
        String k2 = input.next();
        
        if(k1.compareTo(k2)>0){
            System.out.println("Karakter pertama lebih besar dari pada karakter 2");
        }else if(k1.compareTo(k2)<0){
            System.out.println("Karakter pertama lebih kecil dari pada karakter 2");
        }else{
            System.out.println("Kedua karakter adalah sama");
        }
    }
}
