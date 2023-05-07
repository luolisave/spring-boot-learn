package ca.lluo.myspringboot;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

@Controller
public class GradeController {

    // List<Grade> studentGrades = new ArrayList<>();
    List<Grade> studentGrades = Arrays.asList(
        new Grade( "Harry" ,  "Potion", "C+"),
        new Grade( "Jam" ,  "Arithmany", "B+"),
        new Grade( "Lucy" ,  "IT", "A-")
    );

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    @GetMapping("/hello")
    public String SayHello() {
        String SomeStr = "SayHello()";
        return "helloview";
    }

    @GetMapping("/test")
    public String getTest(Model model) {
        Grade grade = new Grade( "Harry" ,  "Potion", "C+");
        model.addAttribute("grade", grade);
        model.addAttribute("sales", 150);
        return "test";
    }
}
