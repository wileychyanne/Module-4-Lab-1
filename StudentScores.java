import java.util.Scanner;
public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int examScore;
        char grade;
        String comment;
        // Get exam score
        System.out.print("Enter exam score: ");
        examScore = input.nextInt();
        if (examScore < 0 || examScore > 100 ) {
            System.out.println("Invalid score. Exam score must be between 0 and 100");
        }
        else {
            if (examScore >= 90) {
                grade = 'A';
                comment = "Excellent";
            }
            else {
                if (examScore >= 80) {
                    grade = 'B';
                    comment = "Very Good";
                }
                else {
                    if (examScore >= 70) {
                        grade = 'C';
                        comment = "Good";
                    }
                    else {
                        if (examScore >= 60) {
                            grade = 'D';
                            comment = "Needs Improvement";
                        }
                        else {
                            grade = 'F';
                            comment = "Failing";
                        }
                    }
                }
            }
            // Display results
            System.out.println("Score: " + examScore);
            System.out.println("Grade: " + grade);
            System.out.println("Comment: " + comment);
        }
        input.close();
    }
}
