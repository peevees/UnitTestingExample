package com.mikecoding.unittestlesson;

public class MyUnit {

    private String strOne;
    private String strTwo;

    public MyUnit(String strOne, String strTwo) {
        this.strOne = strOne;
        this.strTwo = strTwo;
    }

    public String concatenate(){
        return strOne + strTwo;
    }

    public String subtract(){
        if(strTwo.length() >= strOne.length()){
            return "";
        }
        return strOne.substring(strTwo.length());
    }

}
