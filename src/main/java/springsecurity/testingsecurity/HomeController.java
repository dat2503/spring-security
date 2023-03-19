package springsecurity.testingsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/home")
    public String getHome(){
        return "home";
    }

    @GetMapping("/student")
    public String getStudent(){
        return "student";
    }

}
