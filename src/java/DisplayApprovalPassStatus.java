import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayApprovalPassStatus extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        //----Start Session Code----------
            HttpSession session=request.getSession();
            
            String session_username=(String)session.getAttribute("session_username");
            session.setAttribute("session_user", session_username);
            
            String session_password=(String)session.getAttribute("session_password");
            session.setAttribute("session_pass", session_password);
//        ----End Session Code------
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/epass_db";
            String user="root";
            String password="";
            
            int session_uid=(Integer)session.getAttribute("session_uid");
            
            
            Connection con=DriverManager.getConnection(url,user,password);
            PreparedStatement ps=con.prepareStatement("select * from epass where userid="+session_uid);
                    
            out.println("<br><br><center>");
            out.println("<table width=100% border=1 cellpadding='5'>");
            out.println("<tr> <th colspan='11'> <h2>REGISTERED USER DETAILS</h2> </th> </tr>");
            
            ResultSet rs=ps.executeQuery();
            
            out.print("<tr bgcolor='gold'>");
            out.print("<th>EPASS_ID</th>");
            out.print("<th>FNAME</th>");
            out.print("<th>LNAME</th>");
            out.print("<th>EMAIL</th>");
            out.print("<th>PHONENO</th>");
            out.print("<th>TFROM</th>");
            out.print("<th>TTO</th>");
            out.print("<th>DOT</th>");
            out.print("<th>TRAVEL_STATUS</th>");
            out.print("<th>TRAVEL_REASON</th>");
            
            out.print("</tr>");
            
            while(rs.next())
            {
                out.print("<tr>");
                out.print("<td>"+rs.getInt(1)+"</th>");
                out.print("<td>"+rs.getString(3)+"</td>");
                out.print("<td>"+rs.getString(4)+"</td>");
                out.print("<td>"+rs.getString(5)+"</td>");
                out.print("<td>"+rs.getString(6)+"</td>");
                out.print("<td>"+rs.getString(7)+"</td>");
                out.print("<td>"+rs.getString(8)+"</td>");
                out.print("<td>"+rs.getString(9)+"</td>");
                out.print("<td>"+rs.getString(10)+"</td>");
                out.print("<td>"+rs.getString(11)+"</td>");
                
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
