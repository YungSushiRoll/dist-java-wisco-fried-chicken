package edu.wctc.springsecurityassign.Contollers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/benefits")
    public String benefitsPage(Model model){
        model.addAttribute("pageTitle", "Employee Benefits");
        return "benefits";
    }

    @RequestMapping("/SUPER-SECRET-STUFF")
    public String forYourEyesOnly(Model model){
        model.addAttribute("pageTitle", "Secret Recipe");
        return "secretRecipe";
    }
}
