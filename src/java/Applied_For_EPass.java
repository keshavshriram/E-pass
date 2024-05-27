
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;

public class Applied_For_EPass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("`<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\">\n" +
"    </script>\n" +
"    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n" +
"    </script>`");
        
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/epass_db";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("select * from epass");

            out.println("<br><br><center>");
            out.println("<table width=90% border=1 cellpadding='7' class='text-center'>");
            out.println("<tr> <th colspan='11'> <h2 class='text-center'>REGISTERED USER DETAILS</h2> </th> </tr>");

            ResultSet rs = ps.executeQuery();
            HttpSession session=request.getSession();
            
            
            

            out.print("<tr bgcolor='gold'>");
            out.print("<th>EPASS_ID</th>");
            out.print("<th>FNAME</th>");
            out.print("<th>LNAME</th>");
            out.print("<th>EMAIL</th>");
            out.print("<th>PHONENO</th>");
            out.print("<th>TRAVEL FROM</th>");
            out.print("<th>TRAVEL TO</th>");
            out.print("<th>DATE</th>");
            out.print("<th>TRAVEL STATUS</th>");
            out.print("<th>TRAVEL REASON</th>");
            out.print("<th>ACTION</th>");
            out.print("</tr>");

            while (rs.next()) {
                session.setAttribute("epass_id",rs.getInt(1));
                out.print("<tr>");
                out.print("<td>" + rs.getInt(1) + "</th>");
                out.print("<td>" + rs.getString(2) + "</td>");
                out.print("<td>" + rs.getString(3) + "</td>");
                out.print("<td>" + rs.getString(4) + "</td>");
                out.print("<td>" + rs.getString(5) + "</td>");
                out.print("<td>" + rs.getString(6) + "</td>");
                out.print("<td>" + rs.getString(7) + "</td>");
                out.print("<td>" + rs.getString(8) + "</td>");
                out.print("<td>" + rs.getString(9) + "</td>");
                out.print("<td>" + rs.getString(10) + "</td>");
                out.print("<td><a href='okPassStatus.jsp?epass_id="+rs.getInt(1)+"'><button><span class='glyphicon glyphicon-ok'></span></button></a>     <a href='removePassStatus.jsp?epass_id="+rs.getInt(1)+"'><button><span class='glyphicon glyphicon-remove'></span></button></a>      </td>");
//                out.print("<td align='center'><a href=\"okPassStatus.jsp?epass_id=<%=rs.getInt(\"epass_id\")%>\"><button ><span class='glyphicon glyphicon-ok'></span></button></a>    <a href='UpdateStatusByAdmin'><button ><span class='glyphicon glyphicon-remove'></span></button></a></td>");
                out.print("</tr>");
            }
            out.print("</table></center>");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            out.close();
        }
    } //doGet method
} // end of class
