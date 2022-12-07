package form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends GeometricForm {
    protected double length; //visible in Square class, in any child class and any class in the same package

    //constructor
    public Square(double length) {
        super();
        this.length = length;
    }
    public Square(){
        super();
        this.length = 0;
    }
    //redefinition of the method toString

    @Override
    public String toString() {
        return super.toString() + ", length=" + length;
    }
    @Override
    public double area() {
        return length*length;
        //return Math.pow(length,2);
    }

    @Override
    public double perimeter() {
        return 4*length;
    }
}
