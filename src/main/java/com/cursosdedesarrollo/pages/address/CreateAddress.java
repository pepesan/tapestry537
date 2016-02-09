package com.cursosdedesarrollo.pages.address;

import com.cursosdedesarrollo.entities.Address;
import com.cursosdedesarrollo.pages.Index;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

/**
 * Created by pepesan on 9/2/16.
 */
public class CreateAddress {
    @Property
    private Address address;
    @Inject
    private Session session;

    @InjectPage
    private Index index;

    @CommitAfter
    Object onSuccess() {
        session.persist(address);
        return index;
    }
}