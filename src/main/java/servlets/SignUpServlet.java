package servlets;

import accounts.AccountService;
import accounts.UserProfile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class SignUpServlet extends HttpServlet {

    private final AccountService accountService;

    public SignUpServlet(AccountService accountService){
        this.accountService=accountService;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,IOException {


    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,IOException{
        String login=request.getParameter("login");
        String password=request.getParameter("password");

        accountService.addNewUser(new UserProfile(login,password));
        System.out.println(login +" // "+password);

    }
}
