import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    System.out.print("Enter assignment score (out of 100): ");
    int assignment = scanner.nextInt();

    System.out.print("Enter Sessional Exam score (out of 100): ");
    int midterm = scanner.nextInt();

    System.out.print("Enter final exam score (out of 100): ");
    int finalExam = scanner.nextInt();

    int totalScore = assignment + midterm + finalExam;
    double average = totalScore / 3.0;

    System.out.println("Student Name: " + name);
    System.out.println("Assignment Score: " + assignment);
    System.out.println("Midterm Score: " + midterm);
    System.out.println("Final Exam Score: " + finalExam);
    System.out.println("Total Score: " + totalScore);
    System.out.println("Average: " + average);

    if (average >= 90) {
      System.out.println("Grade: A");
    } else if (average >= 80) {
      System.out.println("Grade: B");
    } else if (average >= 70) {
      System.out.println("Grade: C");
    } else if (average >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }
  }
}
