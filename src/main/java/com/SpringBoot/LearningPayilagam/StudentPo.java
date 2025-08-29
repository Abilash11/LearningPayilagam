package com.SpringBoot.LearningPayilagam;

import jakarta.validation.constraints.Size;

public class StudentPo {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentPo(String name, int age, int rollNumber )
    {

    }
/*    public int setAge(int age) {
        this.age = 10;
    }*/
    @Size(min =5, max = 20)
    private  String name; 
    private int age;
    private int rollNumber;

    public int getRollNumber() {

        return  rollNumber  ;
    }
}
