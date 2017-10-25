package servlets;

import accounts.AccountService;
import accounts.UserProfile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserServlet extends HttpServlet{
   // @SuppressWarnings({"FieldCanBeLocal", "UnusedDeclaration"});

    private final AccountService accountService;

    public UserServlet(AccountService accountService){
        this.accountService=accountService;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,IOException{

    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,IOException{

    }

    public void doPut(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException,IOException{

    }

    public void doDelete(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException,IOException{

    }


}
