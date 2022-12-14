package StringModul;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = new String("Happy ");
        String s2 = new String("Birthday");
        
        System.out.printf("s1 = %s\ns2 = %s\n\n",s1,s2);
        System.out.printf(
                "Hasil dari s1.concat(s2) = %s\n", s1.concat(s2));
        System.out.printf("Nilai s1 setelah proses Concate = %s\n",s1);
    }
}
