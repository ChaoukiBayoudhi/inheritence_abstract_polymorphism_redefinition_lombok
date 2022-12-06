package form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends GeometricForm {
    private double length;

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
}
