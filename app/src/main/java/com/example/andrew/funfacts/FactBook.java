package com.example.andrew.funfacts;

import java.util.Random;

/**
 * Created by Andrew on 4/30/2015.
 */
public class FactBook {

    //Member variable
    public String[] mFacts = {
            "Hey", "Ho", "Let's", "GO"
    };
    //Method (abilitites: things the object can do)
    public String getFact(){



        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}
