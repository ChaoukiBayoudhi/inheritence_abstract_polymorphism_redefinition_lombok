package form;

import lombok.*;

@Getter //generates all getter methods for all attributes
@Setter //generates all setter methods for all attributes
//@NoArgsConstructor //generates a no arguments constructor
//@AllArgsConstructor //generates a constructor with all attributes as arguments
//@ToString
public class GeometricForm {
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
}
