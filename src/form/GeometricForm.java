package form;

import lombok.*;

import java.util.Objects;

@Getter //generates all getter methods for all attributes
@Setter //generates all setter methods for all attributes
//@NoArgsConstructor //generates a no arguments constructor
//@AllArgsConstructor //generates a constructor with all attributes as arguments
//@ToString
public abstract class GeometricForm {
    private Long id;
    private static long lastId=0;

    public GeometricForm() {

        id=++lastId;
    }
    //surcharge is define 2 or more methods with the same name but with different parameters in number or/and  type
    //redefinition is giving new implementation for a method already defined in super class. In the case we must keep the same signature

    //definition of the method toString
    @Override
    public String toString() {
        return "id=" + id;
    }
    public abstract double area();
    public abstract double perimeter();

//    @Override
//    public boolean equals(Object obj) { //compares this and obj using id
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        GeometricForm that = (GeometricForm) obj;
//        return id.equals(that.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
    //or we want to compare forms using their area
    @Override
    public boolean equals(Object obj) {
        return this.area()==((GeometricForm)obj).area();
    }
}
