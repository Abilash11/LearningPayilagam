package com.SpringBoot.LearningPayilagam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.security.cert.Certificate;

@Service
public class StudentService
{
    @Autowired
    private Certifications cerifications;

   public StudentPo nameChange(StudentPo student)
   {
//      String updatedName = "Update Name";
      student.setName(student.getName().toUpperCase().concat(cerifications.getCerificationAuthority()));
      return student;

   }

    public StudentPo setAge(StudentPo student)
    {
//      String updatedName = "Update Name";
        student.setAge(student.getAge());
        return student;

    }

}
