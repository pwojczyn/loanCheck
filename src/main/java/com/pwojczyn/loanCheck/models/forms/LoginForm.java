package com.pwojczyn.loanCheck.models.forms;

public class LoginForm {
    private String login;
    private String password;
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
