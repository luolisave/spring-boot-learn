package ca.lluo.myspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

@Controller
public class GradeController {
    @GetMapping("/hello")
    public String SayHello() {
        String SomeStr = "SayHello()";
        return "helloview";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade grade = new Grade( "Harry" ,  "Potion", "C+");
        model.addAttribute("grade", grade);
        model.addAttribute("sales", 150);
        return "grades";
    }
}
