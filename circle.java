/********************************
 * Programmer: Max Bondoc
 * Date: February 2024
 * Program Name: circle.java
 *********************************/

public class Circle{
    public static void main(String[]args){
        double radius = 4.28;
        double area = 0;
        double circumference =  0;

        area = 3.14*(radius*radius);
        circumference =  2*3.14*radius;

        System.out.println("The area of a circle is "+area);
        System.out.println("The circumference of a circle is "+circumference);
        
    }

}
