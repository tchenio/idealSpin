package com.example.idealspin.roll;

import java.math.BigDecimal;

public class Item {
    private String name;
    public BigDecimal hit;
    public Item(String n,double h){
        name = n;
        hit = new BigDecimal(h);
    }
    public String toString(){
        return "name " + name +" " + hit + " %";
    }

}
