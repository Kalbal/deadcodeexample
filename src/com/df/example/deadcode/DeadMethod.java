package com.df.example.deadcode;

public class DeadMethod {

    private String indirectDeadVar3;
    private String goodVar4;
    
    public String goodMethod(){
        return goodVar4;
    }
    
    public String deadMethod(){
        return indirectDeadVar3;
    }
    
   private void  deadPrivateMethod(){
       //do nothing
   }	
}
