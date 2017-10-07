package com.pwojczyn.loanCheck.controllers;

import com.pwojczyn.loanCheck.models.forms.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class LoginController {
    @Autowired
    MessageSource messageSource;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginCheck(@ModelAttribute("loginForm")LoginForm loginForm, Model model, Locale locale) {
        if ( loginForm.checkLogin(loginForm.getLogin()) & loginForm.checkPassword(loginForm.getPassword())){
            model.addAttribute("info","Dane do logowania poprawne");
            return "redirect:/main";
        }else{
            model.addAttribute("info",messageSource.getMessage("loginPage.errorText",new Object[]{loginForm.getLogin()}, locale));
        }

        return "login";
    }
}
