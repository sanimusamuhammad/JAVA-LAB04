import java.util.Scanner;
/**
 * Lab04 Assignment3.
 *
 * @author (Sani Musa Muhammad u15/fns/csc/005)
 * @version (a version number or a date)
 */
public class StudentDemo
{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name ");
    String name = input.next();
    System.out.println("Enter your ID Number ");
    int iDNumber = input.nextInt();
    System.out.println("Enter your grade for quiz 1 ");
    double quiz1 = input.nextDouble();
    System.out.println("Enter your grade for quiz 2 ");
    double quiz2 = input.nextDouble();
    System.out.println("Enter your grade for quiz 3 ");
    double quiz3 = input.nextDouble();
    
    Student Pupil = new Student(name , iDNumber , quiz1 , quiz2 , quiz3);
    
    Pupil.printDetails();
    
    Pupil.average();
    System.out.println("the average is " + Pupil.average);
    
    System.out.println("Enter new grae for quiz 3");
    Pupil.setQuiz3(input.nextDouble());
    System.out.println("the new grade for quiz 3 is "+ Pupil.getQuiz3());
    
    Pupil.printDetails();
    
    Pupil.average();
    System.out.println("the average is " + Pupil.average);
    }
}
