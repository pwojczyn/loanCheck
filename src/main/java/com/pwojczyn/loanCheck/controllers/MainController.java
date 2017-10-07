package com.pwojczyn.loanCheck.controllers;

import com.pwojczyn.loanCheck.models.forms.MainForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class MainController {
    @Autowired
    MessageSource messageSource;
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(@ModelAttribute("loginForm")MainForm mainForm, Model model, Locale locale) {
        model.addAttribute("mainForm",messageSource.getMessage("mainPage.welcomeText",new Object[]{}, locale));

        model.addAttribute("mainForm", new MainForm());
        return "main";
    }
}
