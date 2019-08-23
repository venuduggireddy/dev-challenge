/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perspecta.comment.api.domain;

/**
 *
 * @author 500540
 */
import javax.persistence.*;
import javax.validation.constraints.NotNull;
 
@Entity
@Table
@SuppressWarnings("PersistenceUnitPresent")
public class Person {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
 
    @NotNull
    private String firstName;
 
    @NotNull
    private String lastName;
 
    public Person() {
    }
 
    public Person(@NotNull String firstName, @NotNull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
}
