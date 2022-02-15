package com.tekion.cricketmatch.match.toss;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

public enum Toss {
    HEAD(0),TAIL(1);
    private final int value;
    Toss(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public static Toss doToss() {
        Toss[] toss = Toss.values();
        Random g1 = null;
        try {
            g1 = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toss[Objects.requireNonNull(g1).nextInt(toss.length)];
    }
}