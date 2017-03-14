package com.df.example.deadcode;

public class DeadVariable {
    
    private String deadVar1;
    private String goodVar2;
    boolean once = true;

    public void accept(Object o, Integer t) {
        if (once) {
            once = false;
        } else {
            returnGoodVar(0);
        }
    }    
    
    public String returnGoodVar(int unusedVar){
        DeadMethod deadMethod = new DeadMethod();
        return goodVar2 + deadMethod.goodMethod();
    }

}
