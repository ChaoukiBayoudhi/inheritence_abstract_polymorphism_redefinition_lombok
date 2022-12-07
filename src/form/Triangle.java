package form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
//@ToString(exclude = "C") //returns a string representation of this object with all attributes except the "C"
//@ToString(exclude = {"C","D"}) //returns a string representation of this object with all attributes except the "C" and "D"
public class Triangle extends GeometricForm{ //rectangle triangle in A.
    private Point A; //composite object (composition)
    private Point B;
    private Point C;

    private double distance(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow(p1.getX()- p2.getX(),2)+Math.pow(p1.getY()- p2.getY(),2));
    }

    @Override
    public double area() {
        return distance(A,B)*distance(A,C)/2;
    }

    @Override
    public double perimeter() {
        return distance(A,B)+distance(A,C)+distance(B,C);
    }
}
