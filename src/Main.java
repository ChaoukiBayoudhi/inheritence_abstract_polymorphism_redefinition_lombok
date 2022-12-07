import form.Cercle;
import form.GeometricForm;
import form.Point;
import form.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        GeometricForm gf1=new GeometricForm();
//        GeometricForm gf2=new GeometricForm();
//        GeometricForm gf3=new GeometricForm();
//        System.out.println("form 1 : "+gf1);//call the toString method of the class GeometricForm
       // System.out.println("id form 2 = "+gf1.toString());//the 2 instructions (line 8 and line 9) are equivalent
        GeometricForm gf4;
        gf4=new Square();//polymorphic form
        System.out.print("Enter the square length : ");
        Scanner sc = new Scanner(System.in);
        double length=sc.nextDouble();
        ((Square)gf4).setLength(length);
        System.out.println("form 4 :"+gf4);//call the toString method of the square class
    //create a Circle object
        Cercle c1 = new Cercle();
        System.out.println("Enter the circle 1 radius : ");
        c1.setLength(sc.nextDouble());
        Point pt=new Point();
        pt.input();
        c1.setCenter(pt);
        System.out.println("The circle 1 is "+ c1);
        double a1=c1.area();
        System.out.println("The area of the circle is "+a1);
        //create another circle object
        Cercle c2 = new Cercle();
        System.out.println("Enter the circle 2 radius : ");
        c2.setLength(sc.nextDouble());
        Point pt1=new Point();
        pt1.input();
        c2.setCenter(pt1);
        System.out.println("The circle 2 is "+ c2);
        double a2=c2.area();
        System.out.println("The area of the circle is "+a2);
        //verify if the 2 circles are equal
        if(c1.equals(c2))
            System.out.println("The 2 circles are equal");
        else
            System.out.println("The 2 circles are different");
    }
}