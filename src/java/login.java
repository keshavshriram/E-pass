import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String login_name=request.getParameter("uname");
        String login_password=request.getParameter("pass");
        Connection con;
        
        HttpSession session=request.getSession();
        session.setAttribute("session_username",login_name);
        session.setAttribute("session_password",login_password);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/epass_db";
            String user="root";
            String password="";
            
            con=DriverManager.getConnection(url,user,password);
            PreparedStatement ps=con.prepareStatement("select * from registration where username='"+login_name+"' and password='"+login_password+"'");
            ResultSet rs=ps.executeQuery();
            
            String uname="";
            String upass="";
            int uid=0;
            while(rs.next())
            {
                uname=rs.getString("USERNAME");
                upass=rs.getString("PASSWORD");
                
                uid=rs.getInt("userid");
            }    
            
            session.setAttribute("session_uid",uid);
            
            if(uname.equals(login_name) && upass.equals(login_password))
            {
                response.sendRedirect("User_Dashboard.jsp");
            }
            else{
                out.println("<center><h2>You are not registered with us</h2></center>");
            }
        }
        catch(Exception e)
        {
//            Logger.getLogger(LoginServlet.class.getName()).log(Lavel.SERVE,null)
            System.out.println(e);
        }
    }
}
