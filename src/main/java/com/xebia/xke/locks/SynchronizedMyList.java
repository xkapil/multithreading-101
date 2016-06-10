package com.xebia.xke.locks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kmalhotra on 04/06/16.
 */
public class SynchronizedMyList {

    private List<String> myList = Collections.synchronizedList(new ArrayList<String>());

    public String getLast() {
        int lastIndex = myList.size() - 1;
        return myList.get(lastIndex);
    }

    public void deleteLast() {
        int lastIndex = myList.size() - 1;
        myList.remove(lastIndex);
    }
}
