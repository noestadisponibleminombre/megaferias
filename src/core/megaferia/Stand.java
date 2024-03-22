
package core.megaferia;

import java.util.ArrayList;

public class Stand {
    
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(int id, float precio) {
        this.id = id;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
        
    }
    
}
