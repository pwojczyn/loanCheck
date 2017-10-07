package com.pwojczyn.loanCheck.controllers;

import com.pwojczyn.loanCheck.models.forms.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginCheck(@ModelAttribute("loginForm")LoginForm loginForm, Model model) {
        if ( loginForm.checkLogin(loginForm.getLogin()) & loginForm.checkPassword(loginForm.getPassword())){
            model.addAttribute("info","Dane do logowania poprawne");
        }else{
            model.addAttribute("info","Podałeś złe dane");
        }

        return "login";
    }
}
