import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display_user extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/epass_db";
            String user="root";
            String password="";
            
            Connection con=DriverManager.getConnection(url,user,password);
            PreparedStatement ps=con.prepareStatement("select * from registration");
                    
            out.println("<br><br><center>");
            out.println("<table width=100% border=1 cellpadding='5'>");
            out.println("<tr> <th colspan='7'> <h2>REGISTERED USER DETAILS</h2> </th> </tr>");
            
            ResultSet rs=ps.executeQuery();
            
            out.print("<tr bgcolor='gold'>");
            out.print("<th>USERID</th>");
            out.print("<th>FNAME</th>");
            out.print("<th>LNAME</th>");
            out.print("<th>EMAIL</th>");
            out.print("<th>PHONENO</th>");
            out.print("<th>USERNAME</th>");
            out.print("<th>PASSWORD</th>");
            out.print("</tr>");
            
            while(rs.next())
            {
                out.print("<tr>");
                out.print("<td>"+rs.getInt(1)+"</td>");
                out.print("<td>"+rs.getString(2)+"</tdth>");
                out.print("<td>"+rs.getString(3)+"</td>");
                out.print("<td>"+rs.getString(4)+"</td>");
                out.print("<td>"+rs.getString(5)+"</td>");
                out.print("<td>"+rs.getString(6)+"</td>");
                out.print("<td>"+rs.getString(7)+"</td>");
                out.print("</tr>");
            }
            out.print("</table></center>");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            out.close();
        }
    } //doGet method
} // end of class
