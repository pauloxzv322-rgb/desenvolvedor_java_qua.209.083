package br.com.curso.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("username", user.getUsername());
        return "home"; // nome do arquivo home.html
    }
}


