package com.cursosdedesarrollo.pages;

import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by pepesan on 9/2/16.
 */
public class Guess {
    @Property
    @Persist
    private int target, guessCount;

    @Property
    private int current;

    @Property
    @Persist(PersistenceConstants.FLASH)
    private String message;

    @InjectPage
    private GameOver gameOver;

    void setup(int target)
    {
        this.target = target;
        guessCount = 1;
    }

    Object onActionFromMakeGuess(int value)
    {
        if (value == target)
        {
            gameOver.setup(target, guessCount);
            return gameOver;
        }

        guessCount++;

        message = String.format("Your guess of %d is too %s.", value,
                value < target ? "low" : "high");

        return null;
    }
}
