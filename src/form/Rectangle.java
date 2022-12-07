package form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Rectangle extends Square {
    private double width;

    public Rectangle(double length,double width)
    {
        super(length);
        this.width = width;
    }
    public Rectangle()
    {
        super();
        this.width = 0;
    }
    @Override
    public String toString() {
        return super.toString() + "width=" + width;
    }

    @Override
    public double area() {
        return this.length*this.width;
    }
    @Override
    public double perimeter() {
        return 2*(this.length+this.width);
    }
}
