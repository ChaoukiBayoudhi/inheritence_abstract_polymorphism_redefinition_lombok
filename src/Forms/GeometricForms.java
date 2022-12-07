package Forms;

import form.GeometricForm;

import java.util.ArrayList;
import java.util.List;

public class GeometricForms {//manage a list of GeometricForms
    private List<GeometricForm> lstGeometricForms = new ArrayList<>();// declaration of a dynamic array of GeometricForms

    public void listAll()
    {
        for (GeometricForm geometricForm : lstGeometricForms) {
            System.out.println(geometricForm);
        }
    }
    public  boolean add(GeometricForm gf)
    {
        return lstGeometricForms.add(gf);
    }

}
