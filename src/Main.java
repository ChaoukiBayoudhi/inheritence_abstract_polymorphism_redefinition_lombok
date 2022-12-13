import Forms.GeometricForms;
import form.*;

import java.util.Scanner;

public class Main {
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an option:");
        System.out.println("1. Add a GeometricForm");
        System.out.println("2. Remove a GeometricForm");
        System.out.println("3. update a GeometricForm");
        System.out.println("4. List all geometric forms");
        System.out.println("5. List geometric forms by type");
        System.out.println("6. show a geometric form area");
        System.out.println("7. show a geometric form perimeter");
        System.out.println("8. Exit");
        int choice;
        do {
            choice=scanner.nextInt();
        }while(choice<1 || choice>8);
        return choice;
    }
    public static int subMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a geometric form type:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Cercle");
        System.out.println("4. Triangle");
        System.out.println("5. Exit");
        int choice;
        do {
            choice=scanner.nextInt();
        }while(choice<1 || choice>5);
        return choice;
    }
    public static void main(String[] args) {
        GeometricForms geometricForms = new GeometricForms();//crud opertaions are performed on this object
//        GeometricForm gf1=new GeometricForm();
//        GeometricForm gf2=new GeometricForm();
//        GeometricForm gf3=new GeometricForm();
//        System.out.println("form 1 : "+gf1);//call the toString method of the class GeometricForm
       // System.out.println("id form 2 = "+gf1.toString());//the 2 instructions (line 8 and line 9) are equivalent
//        GeometricForm gf4;
//        gf4=new Square();//polymorphic form
//        System.out.print("Enter the square length : ");
//        Scanner sc = new Scanner(System.in);
//        double length=sc.nextDouble();
//        ((Square)gf4).setLength(length);
//        System.out.println("form 4 :"+gf4);//call the toString method of the square class
//    //create a Circle object
//        Cercle c1 = new Cercle();
//        System.out.println("Enter the circle 1 radius : ");
//        c1.setLength(sc.nextDouble());
//        Point pt=new Point();
//        pt.input();
//        c1.setCenter(pt);
//        System.out.println("The circle 1 is "+ c1);
//        double a1=c1.area();
//        System.out.println("The area of the circle is "+a1);
//        //create another circle object
//        Cercle c2 = new Cercle();
//        System.out.println("Enter the circle 2 radius : ");
//        c2.setLength(sc.nextDouble());
//        Point pt1=new Point();
//        pt1.input();
//        c2.setCenter(pt1);
//        System.out.println("The circle 2 is "+ c2);
//        double a2=c2.area();
//        System.out.println("The area of the circle is "+a2);
//        //verify if the 2 circles are equal
//        if(c1.equals(c2))
//            System.out.println("The 2 circles are equal");
//        else
//            System.out.println("The 2 circles are different");
        GeometricForm gf=null;
        int choice = menu();
        Scanner sc=new Scanner(System.in);
        int subChoice;
        do{
            switch (choice){
                case 1:
                    do {
                        subChoice = subMenu();
                        switch (subChoice) {
                            case 1:

                                gf = new Square();
                                System.out.println("Enter the square length : ");
                                ((Square) gf).setLength(sc.nextDouble());
                                break;
                            case 2:
                                gf = new Rectangle();
                                System.out.println("Enter the rectangle length : ");
                                ((Rectangle) gf).setLength(sc.nextDouble());
                                System.out.println("Enter the rectangle width : ");
                                ((Rectangle) gf).setWidth(sc.nextDouble());
                                break;
                            case 3:
                                gf = new Cercle();
                                System.out.println("Enter the circle radius : ");
                                ((Cercle) gf).setLength(sc.nextDouble());
                                System.out.println("Enter the circle center : ");
                                Point pt = new Point();
                                pt.input();
                                ((Cercle) gf).setCenter(pt);
                                break;
                            case 4:
                                gf = new Triangle();

                                System.out.println("Enter the \"A\" point : ");
                                pt = new Point();
                                pt.input();
                                ((Triangle) gf).setA(pt);
                                System.out.println("Enter the \"B\" point : ");
                                pt = new Point();
                                pt.input();
                                ((Triangle) gf).setB(pt);
                                System.out.println("Enter the \"C\" point : ");
                                pt = new Point();
                                pt.input();
                                ((Triangle) gf).setC(pt);
                                break;
                        }

                        geometricForms.add(gf); //add the geometric form to the list
                    }while(subChoice!=5);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("The list of geometric forms is : ");
                    geometricForms.listAll();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
            choice = menu();
        }while (choice!=8);
    }
}