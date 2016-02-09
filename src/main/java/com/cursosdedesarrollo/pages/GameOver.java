package com.cursosdedesarrollo.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by pepesan on 9/2/16.
 */
public class GameOver {
    @Property
    @Persist
    private int target, guessCount;

    void setup(int target, int guessCount)
    {
        this.target = target;
        this.guessCount = guessCount;
    }
}
