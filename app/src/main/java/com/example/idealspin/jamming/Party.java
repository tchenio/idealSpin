package com.example.idealspin.jamming;

import com.example.idealspin.roll.Roll;

import java.util.ArrayList;
//LOCAL TO THE HOST
public class Party {
    public String partyName;
    private ArrayList<Buddy> invited;
    private Roll r;
    public Party(Roll r, String name){
        this.r = r;
        partyName = name;
        invited = new ArrayList<Buddy>();
    }

    public Party(String name){
        this.r = new Roll();
        partyName = name;
        invited = new ArrayList<Buddy>();
    }
    //TODO SEND INFO TO BUDDY
    public void addBuddy(Buddy b){
        //send invite to buddy
        invited.add(b);
    }
    //TODO GET FEEDBACK ON INVITE
    public void reject(Buddy b){
        //on reject
        invited.remove(b);
    }
}
