/*
 * This program prints the entered word in a diamond fashion
 * For eg :
 *          INPUT - "program"
 *
 *          OUTPUT -
 *                      g
 *                     ogr
 *                    rogra
 *                   program
 *                    rogra
 *                     ogr
 *                      g
 */

import java.util.Scanner;
public class word_as_diamond{

    private static int left, right, mid;

    public static void main(String args[]){
        System.out.println("Enter the word..\n");
        String word = new Scanner(System.in).nextLine();
            printUH(word);
            System.out.println(word);
            printLH(word);
    }

    private static void printUH(String inp) {
        mid = inp.length() / 2;
        left = right = mid;

        for(int row = 1; row <= mid; row++, left--, right++) {
            for (int i = 1; i <= (mid - row + 1); i++) {
                System.out.print(" ");
            }
            System.out.println(inp.substring(left, right + 1));
        }
    }

    private static void printLH(String inp) {
        mid = inp.length() / 2;
        left = 1;
        right = inp.length() - 1;

        for(int row = 1; row <= mid; row++, left++, right--) {
            for (int i = 1; i <= row; i++) {
                System.out.print(" ");
            }
            System.out.println(inp.substring(left, right));
        }
    }
}