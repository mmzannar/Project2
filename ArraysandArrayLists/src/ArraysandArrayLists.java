import java.util.ArrayList;
import java.util.Scanner;

public class ArraysandArrayLists {
    public static void main(String[] args) {
        int midtermscores[] = new int[17];

        midtermscores[0] = 100;
        midtermscores[1] = 97;

        for (int index = 0; index < midtermscores.length; index++) {
            midtermscores[index] = (int) (Math.random() * 41) + 60;

        }
        int highestScore = midtermscores[0];
        int lowestScore = midtermscores[0];
        double totalScore = 0;


        for (int score : midtermscores) {
            System.out.println(score);
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
            totalScore += score;
        }
        System.out.println("Highest Score:" + highestScore);
        System.out.println("Lowest Score:" + lowestScore);
        System.out.println("Average Score:" + totalScore / midtermscores.length);


        String[] names = new String[8];
        names[0] = "Eric";
        names[1] = "Jasmine";
        names[2] = "Joy";
        names[3] = "Jeb";
        names[4] = "Jen";
        names[5] = "Journey";
        names[6] = "Jubilee";
        names[7] = "Jackson";

        for (String name : names) {
            name = name.toUpperCase();
            System.out.println(name);
        }
        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<Integer> scores = new ArrayList<>();
        int score = 0;
        Scanner keyboard = new Scanner(System.in);

        while (score != -1) {
            System.out.println("Please enter a score or -1 to stop");
            score = Integer.parseInt(keyboard.nextLine());
            if (score != -1) {
                scores.add(score);
            }}


            int lowestArrayListScore = scores.get(0);
            int highestArrayListScore = scores.get(0);
            double totalArrayListScores = 0;

            for (int arrayListScore : scores) {
                if (arrayListScore > highestArrayListScore) {
                    highestArrayListScore = arrayListScore;
                }
                if (arrayListScore < lowestArrayListScore) {
                    lowestArrayListScore = arrayListScore;
                }
                totalArrayListScores += arrayListScore;
            }
                System.out.println("Highest array list score " + highestArrayListScore);
                System.out.println("Lowest array list score " + lowestArrayListScore);
                System.out.println("Average array list score " + totalArrayListScores / scores.size());




    scores.remo
    }
}