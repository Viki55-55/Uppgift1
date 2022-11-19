import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Read { //En klass som läser in text och skriver ut resultatet till användaren


    int Amount_of_Rows, Total_Amount_of_Words, Amount_of_Words, Amount_of_Chars, Total_Amount_of_Chars,
            Length_of_Longest_words, Length_of_Total_Longest_words;
    String Longest_Word, Longest_Total_Word;
    List<String> Word_Long_Total = new ArrayList<String>();

    public Read() {
        Amount_of_Rows = 0;
        Longest_Word = Longest_Total_Word = "";
        Amount_of_Chars = Total_Amount_of_Chars = 0;
        Amount_of_Words = Total_Amount_of_Words = 0;
        Length_of_Longest_words = Length_of_Total_Longest_words = 0;

    }

    public void SetInput(String InputReader) {

        Amount_of_Rows++;
    }

    public int GetRows() {
        return Amount_of_Rows;
    }

    public void SetTotalChars(String InputReader) {
        String[] wordsArray = InputReader.trim().split(" "); //Skapar Array of words med String formatet och input InputReader
        //trimmar och raderar eventuella " "
        for (int i = 0; i < wordsArray.length; i++) //Loopar igenom Array of words tills alla ord gås igenom
        {
            char[] eachLetterinArray = wordsArray[i].toCharArray(); // skapar char array och fyller det på med chars från varje ord

            Amount_of_Chars = eachLetterinArray.length; // räkna ut antal chars i varje row (används för att få antal
            // chars i sista row före stop row

            for (int j = 0; j < eachLetterinArray.length; j++)  //loopar igenom varje ord
                if (Character.isLetter(eachLetterinArray[j]))  //methoden kollar om char is letter

                {
                    Total_Amount_of_Chars++; // räknar total antal chars i hela array of chars
                }

        }

    }


    public int GetTotalChars() {
        return Total_Amount_of_Chars;
    }

    public int GetChars() {
        return Amount_of_Chars;
    }

    public void SetWords(String InputReader) {
        InputReader = InputReader.trim(); // removes whitespace from both ends of a string
        Amount_of_Words = InputReader.split("\\s+").length; // split("\\s+") will split the string into string of array with separator as space or multiple spaces. \s+ is a regular expression for one or more spaces
    }

    public int GetWordsCount() {
        return Amount_of_Words;
    }

    public void SetTotalWords(String InputReader) {
        List<String> Word_Total = new ArrayList<String>(); // Array list of Strings skapad
        Word_Total.add(InputReader); //addera InputReader value till Array list
        for (String words : Word_Total) { //for alla ord i Word_Total array list
            words = words.trim().replaceAll(" +", " "); //rensa  String from " "

            for (int i = 0; i < Word_Long_Total.size(); i++)
                System.out.println("longest is: " + Word_Long_Total.get(i));

        }

    }

    public int GetTotalWordsCount() {
        return Total_Amount_of_Words;
    }


    public void SetLongestWord(String InputReader) {

        String Words[] = InputReader.split(" ");
        Longest_Word = Words[0];
        //   System.out.println("current: " + Longest_Word );
        int i;
        int j;
        for (i = 0; i < Words.length; i = j) {
            for (j = i + 1; j < Words.length; j++) {
                if (Longest_Word.length() < Words[j].length()) {
                    Longest_Word = Words[j];
                    break;
                }

            }
            Length_of_Longest_words = Longest_Word.length();
        }
    }


    public String GetLongestWords() {
        return Longest_Word;
    }

    public int GetLongestWordsLength() {
        return Length_of_Longest_words;
    }

    public void SetTotalLongestWord(String Long_Word) {
        //List<String> Word_Long_Total = new ArrayList<String>();

        System.out.println("current longest: " + Long_Word);

        Word_Long_Total.add(Long_Word); //addera InputReader value till Array list
        System.out.println("Longest words in each row" + Word_Long_Total);


        Length_of_Total_Longest_words = Word_Long_Total.get(0).length();
        int index = 0;

        // Use for loop to print out elements from ArrayList
        for (int i = 0; i < Word_Long_Total.size(); i++) {  // Test which String is the largest
            if (Word_Long_Total.get(i).length() > Length_of_Total_Longest_words) {
                Length_of_Total_Longest_words = Word_Long_Total.get(i).length();
                index = i;
            }
        }

        Longest_Total_Word = Word_Long_Total.get(index); // The largest String among all Strings and index it was found at
        System.out.println(Longest_Total_Word + " " + "is the largest and is size " + Length_of_Total_Longest_words);

    }


    public String GetTotalLongestWords() {
        return Longest_Total_Word;
    }

    public int GetTotalLongestLength() {
        return Length_of_Total_Longest_words;
    }

}








