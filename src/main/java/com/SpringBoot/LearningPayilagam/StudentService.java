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

    @Autowired
    private  StudentRepository studentRepository;
   public StudentPo nameChange(StudentPo student)
   {
//      String updatedName = "Update Name";
      student.setName(student.getName().toUpperCase().concat(cerifications.getCerificationAuthority()));
      return student;

   }

   public String saveStudent(StudentPo studentPo) {
       StudentEntity s = new StudentEntity(
               studentPo.getName(),
               studentPo.getAge(),
               studentPo.getRollNumber()
       );


       if(studentRepository.save(s) !=null) {
           return "student saved successfully with roll number: " + studentPo.getRollNumber();
       }
       return  "student not saved";
   }

    public StudentPo setAge(StudentPo student)
    {
//      String updatedName = "Update Name";
        student.setAge(student.getAge());
        return student;

    }

}
