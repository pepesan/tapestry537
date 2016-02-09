package com.cursosdedesarrollo.entities;


import com.cursosdedesarrollo.data.Honorific;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

/**
 * Created by pepesan on 9/2/16.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonVisual
    public Long id;

    public Honorific honorific;
    @Validate("required,minLength=5")
    public String firstName;
    @Validate("required")
    public String lastName;
    @Validate("required")
    public String street1;
    public String street2;
    @Validate("required")
    public String city;
    @Validate("required")
    public String state;
    @Validate("required,regexp=^\\d{5}(-\\d{4})?$")
    public String zip;
    public String email;
    public String phone;
}
