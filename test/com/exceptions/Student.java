package com.exceptions;

public class Student {
    private String name;
    private String uniqueKey;

    public Student (String name, String uniqueKey){
        this.name=name;
        this.uniqueKey=uniqueKey;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return uniqueKey;
    }

    public void setGrade(int i) {

    }
}


