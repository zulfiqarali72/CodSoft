
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class StudentGradeCalculator {
    public static void main (String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
           
         double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
         
          System.out.println("Total Marks :"+totalMarks);
            System.out.println("Average Percentage :"+averagePercentage);
            if (averagePercentage >= 90) {
            System.out.println("Grade :A+");
        } else if (averagePercentage >= 83&& averagePercentage<90 ) {
             System.out.println("Grade :A");
        } else if (averagePercentage >= 78&& averagePercentage<83) {
             System.out.println("Grade :B+");
        } else if (averagePercentage >= 70&& averagePercentage<78) {
           System.out.println("Grade :B");
        } else if (averagePercentage >= 60&& averagePercentage<70) {
               System.out.println("Grade :C+");
        } 
        else if (averagePercentage >= 50&& averagePercentage<60) {
               System.out.println("Grade :C"); 
        }else {
                System.out.println("Grade :FAIL");
        }
    }
}

