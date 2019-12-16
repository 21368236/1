/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 21368236
 */
public class GeometricObject{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangle t = new Triangle();
        System.out.println(t.getArea());
        Triangle t1 = new Triangle(3,4,5);
        System.out.println(t1.getString());
 
    
}
}
class Triangle extends GeometricObject{
       
    double side1 = (1.0);
    double side2 = (1.0);
    double side3 = (1.0);
    double area = (side1 + side2 + side3);
    double perimeter =(side1*side2*side3);
    String string1 = ("The sides of the triangle measure at" + side1 + ", " + side2 + " & " + side3 + "\n The area is " + area + " with perimeter of " + perimeter +".");        
 
    Triangle ()
    {
        
    }
    Triangle(double s1, double s2, double s3) {

     side1 = s1;
     side2 = s2;
     side3 = s3;
     
        }
  
        public double getArea() {
            double area = (side1 + side2 + side3);
           return area;
        }
        public double getPerimeter() {
      double perimeter =(side1*side2*side3);
          return perimeter;
        }
        public String getString() {
            String string1 = ("The sides of the triangle measure at " + side1 + ", " + side2 + " & " + side3 + "\n The area is " + getArea() + " with perimeter of " + getPerimeter() +".");        
           return string1 ;
        }
        
        
}
