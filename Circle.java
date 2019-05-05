/**
 * Lab04 Assignment1b.
 *
 * @author (Sani Musa Muhammad u15/fns/csc/005)
 * @version (a version number or a date)
 */
 class Circle
{
   private static int numberOfCircles = 0;
   
   private double radius;
   
   public Circle(double circleRadius)
   {
       numberOfCircles++;
       radius = circleRadius;
   }
   
   public double area()
   {
       return Math.PI * radius * radius;
   }
   
   public double circumference()
   {
       return 2 * Math.PI * radius;
   }
   
   public static int getNumberOfCircles()
   {
       return numberOfCircles;
   }
    
    public void setRadius(double rad)
    {
        radius = rad;
    }
}
