/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.packt.primeautosales2.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Caleb
 */
@Entity
@Table(name="PRIME_USER")
public class User implements Serializable {

    /**
     * @return the first
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the newsletter
     */
    public boolean isNewsletter() {
        return newsletter;
    }

    /**
     * @param newsletter the newsletter to set
     */
    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    /**
     * @return the enableNotifications
     */
    public boolean isEnableNotifications() {
        return enableNotifications;
    }

    /**
     * @param enableNotifications the enableNotifications to set
     */
    public void setEnableNotifications(boolean enableNotifications) {
        this.enableNotifications = enableNotifications;
    }

    /**
     * @return the emailNotifications
     */
    public boolean isEmailNotifications() {
        return emailNotifications;
    }

    /**
     * @param emailNotifications the emailNotifications to set
     */
    public void setEmailNotifications(boolean emailNotifications) {
        this.emailNotifications = emailNotifications;
    }
    @Id
    private BigDecimal id;
    @Column(name="first_name")
    private String first;
    @Column(name="last_name")
    private String last;
    @Column(name="age")
    private int age;
    @Column(name="email")
    private String email;
    @Column(name="newsletter")
    private boolean newsletter = false;
    @Column(name="enable_Notifications")
    private boolean enableNotifications = false;
    @Column(name="email_Notifications")
    private boolean emailNotifications = false;
    
}
