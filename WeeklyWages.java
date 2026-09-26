import java.util.Scanner;
public class WeeklyWages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Declare variables
        int hoursWorked;
        double payRate;
        double weeklyWages;
// Get hours worked
        System.out.print("Enter weekly hours worked: ");
        hoursWorked = input.nextInt();
// Get hourly pay rate
        System.out.print("Enter hourly pay rate: ");
        payRate = input.nextDouble();
// Calculate regular pay
// Check for overtime
        if (hoursWorked > 40) {
            weeklyWages = (40 * payRate)
                    + ((hoursWorked - 40) * (payRate * 1.5));
        }
        else {
            weeklyWages = payRate * hoursWorked;
        }

// Display weekly wages
        System.out.println("Hours Worked  Hourly rate  Expected Result");
        System.out.printf("%d             %.2f           %.2f%n", hoursWorked, payRate, weeklyWages);
    }
}