package com.xebia.xke.locks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kmalhotra on 04/06/16.
 */
public class ListHelper {

    private List<String> myList = Collections.synchronizedList(new ArrayList<String>());

    public synchronized void putIfAbsent(String val) {
        if (!myList.contains(val)) {
            myList.add(val);
        }
    }

    public List<String> getMyList(){
        return myList;
    }
}
