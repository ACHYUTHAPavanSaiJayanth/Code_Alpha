import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class StudentGradeTracker {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
 
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        // Input grades for each student
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }
 
        // Calculate average, highest, and lowest grades
        double average = calculateAverage(grades);
        double highestGrade = Collections.max(grades);
        double lowestGrade = Collections.min(grades);
 
        // Display results
        System.out.println("\nGrade Summary:");
        System.out.println("Grades entered: " + grades);
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
 
        scanner.close();
    }
 
    // Method to calculate average grade
    public static double calculateAverage(ArrayList<Double> grades) {
        if (grades.isEmpty()) {
            return 0.0;
        }
 
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}