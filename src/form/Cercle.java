package form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cercle extends Square {
    private Point center;

    @Override
    public String toString() {
        //return super.toString()+ ", center = "+center;
        return "Cercle{" +
                "id = "+getId() + ", "+
                "radius = "+getLength() +", "+
                "center = " + center +
                '}';
    }

    @Override
    public double area() {
        return Math.PI*this.length*this.length;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.length;
    }
}
