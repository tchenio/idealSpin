package com.example.idealspin.jamming;

import android.media.Image;

import com.example.idealspin.roll.Roll;

import java.util.ArrayList;

public class Buddy {
    protected Image tof;
    protected String pseudo;
    protected ArrayList<Buddy> buddies;
    protected ArrayList<Roll> preset;
    protected String statut;
    //TODO
    public Buddy(Image i, String p){
        pseudo = p;
        tof = i;
        buddies = new ArrayList<>();
        preset = new ArrayList<>();
        statut = "";

    }
}
