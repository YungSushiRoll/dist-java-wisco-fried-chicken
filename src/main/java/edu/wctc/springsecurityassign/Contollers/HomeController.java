package edu.wctc.springsecurityassign.Contollers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("pageTitle", "Home Page");
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("pageTitle", "Login");
        return "login";
    }

    @RequestMapping("/redirect/the-secret")
    public String redirect(Model model){
        model.addAttribute("pageTitle","THE SECRET");
        return "redirect:https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstleyVEVO";
    }
}
