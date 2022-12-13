package Forms;

import form.GeometricForm;

import java.util.ArrayList;
import java.util.List;

public class GeometricForms {//manage a list of GeometricForms
    private List<GeometricForm> lstGeometricForms = new ArrayList<>();// declaration of a dynamic array of GeometricForms

    public void listAll()
    {
        for (GeometricForm x : lstGeometricForms) {
            System.out.println(x);
        }
        //or
       for(int i=0;i<lstGeometricForms.size();i++)
         {
              System.out.println(lstGeometricForms.get(i));
         }
       //or
        System.out.println(lstGeometricForms);
       //or
        lstGeometricForms.forEach(System.out::println);
    }
    public  boolean add(GeometricForm gf)
    {
        return lstGeometricForms.add(gf);
    }

}
