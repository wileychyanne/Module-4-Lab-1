import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Ask the user to enter student score
        System.out.print("Enter a score: ");
        int score = input.nextInt();

// Initialize grade and if grade is greater than 90 it is an A
        char grade = 0;
        if (score >= 90) {
            grade = 'A';
        }
// Display the grade
        System.out.println("The grade is: " + grade);
        input.close();
    }
}
