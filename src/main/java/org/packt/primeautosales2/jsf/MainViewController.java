/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.packt.primeautosales2.jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;

/**
 *
 * @author Caleb
 */
@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {
    
    private String selectionType;
    private List<objct> objects = new ArrayList();
    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }
    
    public void layoutResizeEvent (ResizeEvent event){
        System.out.println("The layout has been sized: " + event.getComponent());
    }

    /**
     * @return the selectionType
     */
    public String getSelectionType() {
        return selectionType;
    }

    /**
     * @param selectionType the selectionType to set
     */
    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }
    
    public String navigateToA1(){
        selectionType="specification1";
        return "automobile";
    }
    
    public String navigateToA2(){
        selectionType="specification2";
        return "automobile";
    }
    
    public String navigateToA3(){
        selectionType="specification3";
        return "automobile";
    }

    /**
     * @return the objects
     */
    public List<objct> getObjects() {
        objct object1= new objct();      
        object1.setInfo1("String");
        object1.setInfo2("String");
        objct object2= new objct();      
        object2.setInfo1("String");
        object2.setInfo2("String");
        objct object3= new objct();      
        object3.setInfo1("String");
        object3.setInfo2("String");
        objects=new ArrayList();
        objects.add(object1);
        objects.add(object2);
        objects.add(object3);
        return objects;
    }

    /**
     * @param objects the objects to set
     */
    public void setObjects(List<objct> objects) {
        this.objects = objects;
    }
    
}
