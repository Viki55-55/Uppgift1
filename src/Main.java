import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Main { //    En klass som räknar raderna, har koll på antalet tecken
    public static void main(String[] args) {

    String Long_Word;
        {

            Scanner scan = new Scanner(System.in);
            System.out.println("Hello, ENTER A STRING and when you wish to exit program enter stop or Stop ");
            String InputReader= scan.nextLine();

            Read myInput_Words = new Read();

            while(!InputReader.equals("Stop") & !InputReader.equals("stop"))
            {
                myInput_Words.SetInput(InputReader);
                myInput_Words.SetWords(InputReader);
                myInput_Words.SetTotalWords(InputReader);
                myInput_Words.SetTotalChars(InputReader);
                myInput_Words.SetLongestWord(InputReader);

                Long_Word = myInput_Words.GetLongestWords(); // pass the current longest word to get the longest of long ones
                System.out.println(Long_Word); //

                myInput_Words.SetTotalLongestWord(Long_Word); // pass the current longest word to get the longest of long ones
                System.out.println("ENTER ANOTHER STRING or break (type stop)");
                InputReader = scan.nextLine();

            }

            System.out.println("Amount of Rows is: " + myInput_Words.GetRows() + " and Amount of words in current Row is: " + myInput_Words.GetWordsCount() + " and Total Amount of words is: " + myInput_Words.GetTotalWordsCount());
            System.out.println("Amount of Chars in last row (before stop row) is: " + myInput_Words.GetChars() + "   Total Amount of Chars in all rows (exclusive stop) is: " + myInput_Words.GetTotalChars());//  + " and Amount of words in current Row is: " + myInput_Words.GetWordsCount() + " and Total Amount of words in current Row is: " + myInput_Words.GetTotalWordsCount());
            System.out.println("Longest word in last row (before stop row) is: " + myInput_Words.GetLongestWords() + " and the length is " + myInput_Words.GetLongestWordsLength());//Total Amount of Chars in all rows (exclusive stop) is: " + myInput_Words.GetTotalChars());//  + " and Amount of words in current Row is: " + myInput_Words.GetWordsCount() + " and Total Amount of words in current Row is: " + myInput_Words.GetTotalWordsCount());
            System.out.println("Longest word in ALL rows (before stop row) is: " + myInput_Words.GetTotalLongestWords()); //+ " and the length is " + myInput_Words.GetLongestWordsLength());//Total Amount of Chars in all rows (exclusive stop) is: " + myInput_Words.GetTotalChars());//  + " and Amount of words in current Row is: " + myInput_Words.GetWordsCount() + " and Total Amount of words in current Row is: " + myInput_Words.GetTotalWordsCount());

            //System.exit(0);
        }

//public string getLongestWord()a
        //     {
        //String text = findLongestWord();
        //    }

        //  function findLongestWord(str) {
        //    var longestWord = str.split(' ').sort(function(a, b) { return b.length - a.length; });
        //return longestWord[0].length;

    }

}