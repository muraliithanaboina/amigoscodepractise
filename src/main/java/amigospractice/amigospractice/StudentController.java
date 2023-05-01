package amigospractice.amigospractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
 @Autowired
    private  student student;

 public List<student> getStudent() {
     return  new ArrayList<>(Arrays.asList(new student("murali",1),new student("anjali",2)));
 }
}
