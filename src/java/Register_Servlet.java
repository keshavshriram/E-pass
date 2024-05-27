import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Register_Servlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String email=request.getParameter("email");
        String phoneno=request.getParameter("phoneno");
        String uname=request.getParameter("uname");
        String password=request.getParameter("pass");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/epass_db";
            String user="root";
            String password_db="";
            
            Connection con=DriverManager.getConnection(url, user, password_db);
            
            String myquery="insert into registration(FNAME,LNAME,EMAIL,PHONENO,USERNAME,PASSWORD) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(myquery);
            
            ps.setString(1,fname);
            ps.setString(2,lname);
            ps.setString(3,email);
            ps.setString(4,phoneno);
            ps.setString(5,uname);
            ps.setString(6,password);
            
            int i=ps.executeUpdate();
            
            if(i>0)
            {
                out.print("<br><br><br>");
                out.print("<center>");
                out.print("<img src='check.png' width='200' height='150'></img>");
                out.print("<h3>You are successfully registered.....</h3>");
                out.print("<br>");
                out.print("<a href='index.html'>Go to Login  </a>");
                out.print("<center>");

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            out.close();
        }
    }
}
