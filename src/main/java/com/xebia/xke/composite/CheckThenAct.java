package com.xebia.xke.composite;

/**
 * Created by kmalhotra on 03/06/16.
 */
public class CheckThenAct {
    private HeavyObject instance = null;

    public HeavyObject getHeavyObject(){
        if (instance == null){
            instance = new HeavyObject();
        }
        return instance;
    }
}



class HeavyObject{

}
