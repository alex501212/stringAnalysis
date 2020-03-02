package the_string_analyser;
import java.util.Scanner;

public class The_String_Analyser
{
    // letters a-z
    final static char[] LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                                   'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    final static int LEN = 26;  // length of alphabet
    private static int[] frq = new int[26];  // stores frequency for each letter a-z
    private static Scanner scan = new Scanner(System.in);  // scanner obj for system input from keyboard
    
    public static void main(String[] args)
    {
        String input = scan.nextLine();  // takes in the next string inputted by the user
        char[] stripped = (strip(input)).toCharArray();  /* passes input to the strip method, converts into chars and
                                                            adds to a char array */
        find_frq(stripped);  // find the frequency of each character in the inputted string
        // iterate through letters and frq printing them to the console
        for (int i = 0; i < LEN; i++)
        {
            System.out.println(LETTERS[i] + " Occurred: " + frq[i] + " Times in This String.");
        }
    }

    public static String strip(String input)
    {
        /* makes sure string only has chars in the alphabet. replaces all non a-z chars(\\W) with "" then replaces
           all digits(\\d) with "" */
        String strip = input.replaceAll("\\W", "").replaceAll("\\d", "");
        strip = strip.toLowerCase();  //converts string to lower case characters
        return strip;
    }

    public static void find_frq(char[] stripped)
    {
        for (char items : stripped)  // for each character in the stripped array
        {
            /* compares each char in input to each char in letters and increments the iterations of frq. each
               iteration of frq correlates to the position of each letter a-z */
            for (int i = 0; i < LEN; i++)
            {
                if (LETTERS[i] == items)
                {
                    frq[i]++;
                }
            }
        }
    }
}