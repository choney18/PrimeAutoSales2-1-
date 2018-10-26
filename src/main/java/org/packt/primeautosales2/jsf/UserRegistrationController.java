/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.packt.primeautosales2.jsf;


import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.packt.primeautosales.entity.User;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author Caleb
 */
@Named(value = "userRegistrationController")
@ViewScoped
public class UserRegistrationController implements Serializable {
    private User current;
    /**
     * Creates a new instance of UserRegistrationController
     */
    public UserRegistrationController() {
    }
    
    public User getCurrent(){
        if (current == null){
            current = new User();
        }
        return current;
    }
    
    public String flowHandler (FlowEvent event){
        if (current !=null) {
            System.out.println("current: " + current);
            if (!current.isEnableNotifications()){
                return "Confirm";
            }else{
            return event.getNewStep();
        }        
        }  else {
            return event.getNewStep();
        }
 
}
    
}
