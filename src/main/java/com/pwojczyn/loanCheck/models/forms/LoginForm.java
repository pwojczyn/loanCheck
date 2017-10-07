package com.pwojczyn.loanCheck.models.forms;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class LoginForm {
    @NotBlank
    @Size(min = 3, max = 30)
    private String login;
    @NotBlank
    @Size(min = 3, max = 30)
    private String password;
    @NotBlank
    @Size(min = 3, max = 30)
    private String nick;

    public LoginForm(String login, String password, String nick) {
        this.login = login;
        this.password = password;
        this.nick = nick;
    }

    public LoginForm() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    public boolean checkLogin(String login){
        if (login.equals("oskar")){
            return true;
        }
        else
            return false;
    }
    public boolean checkPassword(String password){
        if (password.equals("admin")){
            return true;
        }else
            return false;
    }
}
