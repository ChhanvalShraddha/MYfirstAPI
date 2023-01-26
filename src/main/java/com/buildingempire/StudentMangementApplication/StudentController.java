package com.buildingempire.StudentMangementApplication;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;

@RestController
public class StudentController {
    HashMap<Integer,Student> db=new HashMap<>();
    @PutMapping("/put_student")
    public String updateStudent(@RequestBody Student student){
        int admno=student.getAdmno();
        student.setAge(student.getAge());
        student.setName(student.getName());
        student.setState(student.getState());
        db.put(admno,student);
        return "Updated Successfully congratualations";

    }
    @DeleteMapping("/delete_student/{admno}")
    public String deleteStudent(@RequestBody Student student){
       int admno=student.getAdmno();
        db.remove(admno);
        return "student details deleted";
    }
    @GetMapping("/get_student")
    public Student getstudent(@RequestParam("q") int admno){ //return class Student object that is why we have used Student
        return db.get(admno);
    }
    @PostMapping("/add_student")
    public  String addStudent(@RequestBody Student student){ //beacause we are adding information in object body so use @RequestBody
        int admno= student.getAdmno();
        db.put(admno,student);
        return "Student added successfully";
    }
}
