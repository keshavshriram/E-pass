import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ApplyForEPass extends HttpServlet 
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
        String TFrom=request.getParameter("TFrom");
        String TTo=request.getParameter("TTo");
        
        String dot=request.getParameter("dot");
        String travel_status=request.getParameter("travel_status");
        String travel_reason=request.getParameter("travel_reason");
        
        HttpSession session=request.getSession();

        
        int session_user_id = (Integer) session.getAttribute("session_uid");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/epass_db";
            String user="root";
            String password_db="";
            
            Connection con=DriverManager.getConnection(url, user, password_db);
            
            String myquery="insert into epass(USERID,FNAME,LNAME,EMAIL,PHONENO,TFROM,TTO,DOT,TRAVEL_STATUS,TRAVEL_REASON)values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(myquery);
            
            ps.setInt(1,session_user_id);
            ps.setString(2,fname);
            ps.setString(3,lname);
            ps.setString(4,email);
            ps.setString(5,phoneno);
            ps.setString(6,TFrom);
            ps.setString(7,TTo);
            ps.setString(8,dot);
            ps.setString(9,travel_status);
            ps.setString(10,travel_reason);
            
            int i=ps.executeUpdate();
            
            if(i>0)
            {
                out.print("<br><br><br>");
                out.print("<center>");
                out.print("<img src='check.png' width='200' height='150'></img>");
                out.print("<h3>You are successfully registered.....</h3>");
                out.print("<br>");
                out.print("<a href='user_Dashboard.html'>Go to User Dashboard</a>");
                out.print("<center>");

            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            out.println(e);
        }
        finally
        {
            out.close();
        }
    }
}
