package Jsd_batch.example.StudentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
public class StudentController {
    Map<Integer, Student> db = new HashMap<>();

    @PostMapping("/add_student")
    public String addStudent(@RequestBody  Student student) {
        int admno = student.getAdmnNO();
        db.put(admno, student);
        return "Student added successfully";
    }

    @GetMapping("get_student")
    public Student getStudent(@RequestParam("q") int admnNo){
        return db.get(admnNo);
    }

    @PutMapping("/update_student")
    public String updateStudent(@RequestBody Student student){
       int admno = student.getAdmnNO();
        db.replace(admno ,student);
        return "student data update successfully";
    }
  @DeleteMapping("/delete_student")
    public String  deleteStudent(@RequestParam("id") int admnNo){
        db.remove(admnNo);
      return "Student deleted successfully";

  }

}
