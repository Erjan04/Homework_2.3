package com.company;

public class LimitException extends Exception{

    public LimitException(String message,double remainingAmount) {
        super(message);
    }

    public double getRemainingAmount(){


        return 0;
    }
}
