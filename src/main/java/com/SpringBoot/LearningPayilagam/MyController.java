package com.SpringBoot.LearningPayilagam;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController  //Normal Controller we need to mention return type but in RestController no need to mention the return type
 // it will create a html body and store the result for all the methods
//@Controller

@RequestMapping("/mycontroller") //localhost:8080/mycontroller

public class MyController {
    private static final Log logger = LogFactory.getLog(MyController.class);

    private   StudentService  studentService ;
    @Autowired
    public MyController(StudentService studentService)
    {
        this.studentService= studentService;
    }
/*@Autowired
public void setStudentService (StudentService studentService)
{
    this.studentService = studentService;
}*/

 @RequestMapping("/hello")             //localhost:8080/mycontroller/hello
 //@ResponseBody
 public  String  hello()
 {
     logger.info("Inside the Hello!!!! Method");
     return "Hello";
 }

 @RequestMapping("/goodBye")
//@ResponseBody //localhost:8080/mycontroller/goodBye
    public  String  goodBye()
    {
        logger.info("Inside the goodBye :( Method");
        return "GoodBye";
    }

    @GetMapping("/add/{first}/{second}")
    public String addition(@PathVariable  int first, @PathVariable int second)
    {
    int result;
    result = first+second;
    logger.info("Inside addition method in my controller: ");
    return  "The sum of first and second number is " + result;
    }

    @GetMapping("/productMulti")
   public String MultiplicationOfNumber(@RequestParam int a,@RequestParam int b)
        {
            int result;
            logger.info("Multiplying two numbers");
            result = a+b;
            return  "Multipled two numbers : "+ result;
        }

        @PostMapping("/student")
    public StudentPo nameChange (@RequestBody StudentPo student)
        {
            logger.info("inside student Save or get name method: ");
//                 student.setName(student.getName().toUpperCase());
//            StudentService studentService = new StudentService();
            return studentService.nameChange( student);
       }

       @PutMapping("/ageChange")
    public StudentPo ageChange (@RequestBody StudentPo student)
    {
        logger.info("This is inside put method, age change");
//        StudentService studentService = new StudentService();
       return studentService.setAge(student);
    }


}
