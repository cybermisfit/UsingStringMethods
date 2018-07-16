/*Your assignment

        Create a program that will allow users to enter a word, and a character number index.
        Your program will print out the size of the word, as well as the substring (starting from 0) to the
        index the user specified. f the user entered index is larger than the size of the word, the program will print
        "Index is larger than length".*/

import java.util.Scanner;
public class UsingStringMethods {

        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            String wordOfTheDay;
            int characterIndex;

            System.out.println("Enter a word for today: ");
            wordOfTheDay = keyboard.next();

            System.out.println("Enter the number 3 for your character index: ");
            characterIndex = keyboard.nextInt();

            //String text = "Hello World!";
            //String another = "Today is going to be a beautiful day!";

            //System.out.println("Using .length(): " );
            System.out.println("The amount of characters in this word is : " + wordOfTheDay.length());
            //System.out.println("The amount of characters in this other word is : " + another.length());

            //System.out.println("Using .substring(): " );
            System.out.println("The section of word from the index 0-3 is : " + wordOfTheDay.substring(0,3));
            //System.out.println("The section of word from index 5-10 is : " + another.substring(5,10));

            //System.out.println("Using .charAt(): " );
            //System.out.println("The character at index 1 is : " + wordOfTheDay.charAt(1));
            //System.out.println("The character at index 10 is : " + another.charAt(10));

            if (characterIndex > 3) {
                System.out.println("Index is larger than length");
            }
            else {
                System.out.println("Thanks for entering a word today!");
            }
        }

    }

