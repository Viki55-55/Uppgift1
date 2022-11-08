import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
    public class Read { //En klass som läser in text och skriver ut resultatet till användaren


        int Amount_of_Rows,  Total_Amount_of_Words, Amount_of_Words, Amount_of_Chars, Total_Amount_of_Chars,
                Length_of_Longest_words;
        ;
        String Longest_Word, Longest_Total_Word;
        String LongWords[] ;
        public Read()
        {
            Amount_of_Words = 0;
            Longest_Word = "";
            Amount_of_Rows = 0;
            Amount_of_Chars = Total_Amount_of_Chars = 0;
            Amount_of_Words = Total_Amount_of_Words = 0;
            Length_of_Longest_words = 0;

        }

        public void SetInput(String InputReader)
        {

            Amount_of_Rows++;
       }

        public int GetRows()
        {
            return Amount_of_Rows;
        }

        public void SetTotalChars(String InputReader)
        {
            String [] wordsArray = InputReader.trim().split(" "); //Skapar Array of words med String formatet och input InputReader
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



        public int GetTotalChars()
        {
            return Total_Amount_of_Chars;
        }

        public int GetChars()
        {
            return Amount_of_Chars;
        }

        public void SetWords(String InputReader)
        {
            InputReader = InputReader.trim();
           Amount_of_Words = InputReader.split("\\s+").length;
        }

        public int GetWordsCount()
        {
            return Amount_of_Words;
        }

        public void SetTotalWords(String InputReader)
        {
            List<String> Word_Total = new ArrayList<String>(); // Array list of Strings skapad
            Word_Total.add(InputReader); //addera InputReader value till Array list
             for(String  words: Word_Total)
             { //for alla ord i Word_Total array list
                words = words.trim().replaceAll(" +", " "); //rensa  String from " "
                if(!words.isEmpty()) //skip empty strings if there are such
                    {
                    Total_Amount_of_Words += words.split(" ").length; //räkna ord genom att dela dem med " "
                    }
             }

        }

        public int GetTotalWordsCount()
        {
            return Total_Amount_of_Words;
        }




        public void SetLongestWord(String InputReader)
        {

            String Words[] = InputReader.split(" ");
            Longest_Word = Words[0];
         //   System.out.println("current: " + Longest_Word );
            int i; int j ;
            for( i = 0; i < Words.length; i = j)
            {
                for( j =i+1; j < Words.length; j++)
                {
                    if(Longest_Word.length() < Words[j].length())
                    {
                        Longest_Word = Words[j];
                        break;
                    }

                } Length_of_Longest_words = Longest_Word.length();
           }
        }


        public String GetLongestWords()
        {
            return Longest_Word;
        }

        public int GetLongestWordsLength()
        {
            return Length_of_Longest_words;
        }

        public void SetTotalLongestWord(String Long_Word)
        {
            List<String> Word_Long_Total = new ArrayList<String>();

            System.out.println("current longest: " + Long_Word );
           // String LongWords[] = Long_Word.split("");

            //Longest_Total_Word = LongWords[0];
            //System.out.println("first word : " + LongWords[0] );

           // Array list of Strings skapad
            Word_Long_Total.add(Long_Word); //addera InputReader value till Array list
            for(String  long_words: Word_Long_Total)
            { //for alla ord i Word_Total array list
                long_words = long_words.trim().replaceAll(" +", " "); //rensa  String from " "

                for (int i = 0; i < Word_Long_Total.size(); i++)
                    System.out.println("longest is: " + Word_Long_Total.get(i));

                }
            int maxLength = 0;
            for (String long_words: Word_Long_Total) {
                if (long_words.length() > maxLength) {
                    maxLength = long_words.length();
                    Word_Long_Total.clear();
                    Word_Long_Total.add(long_words);
                } else if (long_words.length() == maxLength) {
                    Word_Long_Total.add(long_words);
                }
            }
            }

           // int i; int j ;
            //for( i = 0; i < LongWords.length; i = j)
            //{
              //  for( j =i+1; j < LongWords.length; j++)
                //{
                  //  if(Longest_Word.length() < LongWords[j].length())
                    //{
                      //
            //  Longest_Total_Word = LongWords[j];

                     //   System.out.println("longest new word : " + LongWords[j] );
                        //break;
                   // }

                //} Length_of_Longest_words = Longest_Total_Word.length();
           // }

        public String GetTotalLongestWords()
        {
            return Longest_Total_Word;
        }

    }








