package com.SpringBoot.LearningPayilagam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class StudentEntity {

private  String name;
private  int age;



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Id
    @Column(name ="roll_number")
    private  int rollNumber;

//Default Constructor

    public StudentEntity()
    {

    }

    public StudentEntity(String name, int age, int rollNumber)
    {
        this.name = name;
        this.age =age;
        this.rollNumber =  rollNumber;
    }


}
