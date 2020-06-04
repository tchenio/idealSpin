package com.example.idealspin.roll;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Roll {
    public LinkedList<Item> items;
    public Roll(){
        items = new LinkedList<Item>();
    }
    public void add(Item i ){
        items.add(i);
    }
    public boolean checkSum(){
        BigDecimal sum = new BigDecimal(0);
        for (Item i: items) {
            sum = sum.add(i.hit);

        }
        return sum. .equals("1.0") ;
    }
}
