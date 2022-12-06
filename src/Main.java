import form.Cercle;
import form.GeometricForm;
import form.Point;
import form.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GeometricForm gf1=new GeometricForm();
        GeometricForm gf2=new GeometricForm();
        GeometricForm gf3=new GeometricForm();
        System.out.println("form 1 : "+gf1);//call the toString method of the class GeometricForm
       // System.out.println("id form 2 = "+gf1.toString());//the 2 instructions (line 8 and line 9) are equivalent
        GeometricForm gf4;
        gf4=new Square();//polymorphic form
        System.out.print("Enter the square length : ");
        Scanner sc = new Scanner(System.in);
        double length=sc.nextDouble();
        ((Square)gf4).setLength(length);
        System.out.println("form 4 :"+gf4);//call the toString method of the square class

        Cercle c1 = new Cercle();
        System.out.println("Enter the circle radius : ");
        c1.setLength(sc.nextDouble());
        Point pt=new Point();
        pt.input();
        c1.setCenter(pt);
        System.out.println("The circle is "+ c1);
    }
}