import java.util.Scanner;


public class Lab1Code {

    public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);


        System.out.println("Please enter your name");
String name = keyboard.nextLine();

        System.out.println("Hello "+ name );

        System.out.println("How many pages are in a book you are interested in reading?");
        int numberOfPagesInBook = Integer.parseInt(keyboard.nextLine());


        System.out.println("How many days do you want to spend reading this book?");
        int numberOfDays = Integer.parseInt(keyboard.nextLine());

        System.out.println("You need to read");
        System.out.println(numberOfPagesInBook/numberOfDays);

        System.out.println("pages per day to finish the book in");

        System.out.println(numberOfDays);
        System.out.println("days");

    }



}
