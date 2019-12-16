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
    }
    
}
public class Triangle extends GeometricObject{
    double side1 = (1.0);
    double side2 = (1.0);
    double side3 = (1.0);
    double area = (side1 + side2 + side3);
    double perimeter =(side1*side2*side3);
    String string1 = ("The sides of the triangle measure at" + side1 + ", " + side2 + " & " + side3 + "\n The area is " + area + " with perimeter of " + perimeter +".");        
    Triangle() {
    }
        public double getArea() {
            return area;
        }
        public double getPerimeter() {
            return perimeter;
        }
        public double getString() {
            return string1 ;
        }
        
        
    }
}
