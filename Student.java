
/**
 * Lab04 Assignment3.
 *
 * @author (Sani Musa Muhammad u15/fns/csc/005)
 * @version (a version number or a date)
 */
public class Student
{
   private String name;
   private int iDNumber;
   private double quiz1 , quiz2 , quiz3;
   public double average;
   
   public Student( String _name , int _iDNumber , double _quiz1 , double _quiz2 ,double _quiz3){
       name = _name;
       iDNumber = _iDNumber;
       quiz1 = _quiz1;
       quiz2 = _quiz2;
       quiz3 = _quiz3; 
    }
    public String getName(){
        return name;
    }
    public int getIdname(){
        return iDNumber;
    }
    public double getQuiz1(){
        return quiz1;}
        public double getQuiz2(){
        return quiz2;}
        public double getQuiz3(){
        return quiz3;}
        
        public void setQuiz1(double newQuiz1){
            quiz1 = newQuiz1;}
            public void setQuiz2(double newQuiz2){
                quiz2 = newQuiz2;
            }
            public void setQuiz3(double newQuiz3){
                quiz3 = newQuiz3;
            }
            public double average(){
                average = (quiz1 + quiz2 + quiz3)/2;
                return average;
            }
             public void printDetails(){
                 System.out.println("Student Name = " + name);
                 System.out.println("Student ID = " + iDNumber);
                 System.out.println("Quiz Grades = " + quiz1 + "\t" + quiz2 + "\t" + quiz3);
                }
                
}
