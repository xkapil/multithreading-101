package com.xebia.xke.locks;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kmalhotra on 04/06/16.
 */
public class NumberRange {

    private AtomicInteger lower = new AtomicInteger(0);

    private AtomicInteger upper = new AtomicInteger(0);

    public void setLower(int val){
        if(val > upper.get())
            throw new IllegalArgumentException("Value provided is higher than upper");
        lower.set(val);
    }

    public void setUpper(int val){
        if(val < lower.get())
            throw new IllegalArgumentException("Value provided is lower than Lower");
        upper.set(val);
    }
}
