package com.df.example.deadcode;

public class DeadVariable {
    
    private String deadVar1;
    private String goodVar2;
    
    
    public String returnGoodVar(){
        DeadMethod deadMethod = new DeadMethod();
        return goodVar2 + deadMethod.goodMethod();
    }

}
