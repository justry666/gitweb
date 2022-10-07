import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name="loginServlet",urlPatterns="/loginServlet")
public class loginServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{
        response.setContentType("text/html;charset=utf-8");
        String username=request.getParameter("username");//获取用户名密码
        String password=request.getParameter("password");
        if(("admin").equals(username)&&("123").equals(password))//假定数据
            response.sendRedirect("/welcome.html");//判断后重定向
        else response.sendRedirect("/login.html");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{
        doGet(request,response);
    }
}