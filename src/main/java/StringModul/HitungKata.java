package StringModul;

import javax.swing.JOptionPane;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class HitungKata {

    private static final char BLANK = ' ';

    public static void main(String[] args) {
        int index, wordCount, numberOfCharacters;

        String sentence = JOptionPane.showInputDialog("Input Kalimat: ");

        numberOfCharacters = sentence.length();
        index = 0;
        wordCount = 0;

        while (index < numberOfCharacters) {
            while (index < numberOfCharacters && sentence.charAt(index) == BLANK) {
                index++;
            }
            while (index < numberOfCharacters && sentence.charAt(index) != BLANK) {
                index++;
            }
            wordCount++;
        }
        System.out.println("\nInput sentence: " + sentence);
        System.out.println("    Word count: " + wordCount + " words ");
    }
}
