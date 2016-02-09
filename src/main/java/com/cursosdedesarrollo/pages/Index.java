package com.cursosdedesarrollo.pages;

import java.util.Date;
import java.util.List;
import java.util.Random;

import com.cursosdedesarrollo.entities.Address;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.annotations.*;
import org.apache.tapestry5.corelib.components.*;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.alerts.AlertManager;
import org.hibernate.Session;

/**
 * Start page of application tapestry537.
 */
public class Index{

    private final Random random = new Random(System.nanoTime());

    @InjectPage
    private Guess guess;
    @Inject
    private Session session;
    public List<Address> getAddresses()
    {
        return session.createCriteria(Address.class).list();
    }
    @Log
    Object onActionFromStart()
    {
        int target = random.nextInt(10) + 1;

        guess.setup(target);
        return guess;
    }
}
