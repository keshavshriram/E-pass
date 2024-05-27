package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <title>E-Pass Registration</title>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .abc{\n");
      out.write("                padding: 5px;\n");
      out.write("                background: linear-gradient(to left, gold, limegreen);\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            #tagline{\n");
      out.write("                color: #000123;\n");
      out.write("                margin-top: -15px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                font-style: italic;\n");
      out.write("            }\n");
      out.write("            .form{\n");
      out.write("                width: 30%;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: gold;\n");
      out.write("                font-family: Arial;\n");
      out.write("                font-size: 12px;\n");
      out.write("                float: right;\n");
      out.write("                margin-top: 10%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            .heading{\n");
      out.write("                color: limegreen;\n");
      out.write("                font-family: Arial;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            a:hover{\n");
      out.write("                color: #000123;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .well{\n");
      out.write("                background-color: gold;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                box-shadow: 2px 2px rgba(0,0,0,0.3);\n");
      out.write("            }\n");
      out.write("            .well{\n");
      out.write("                box-shadow: 2px 2px rgba(0,0,0,0.3);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String session_username = (String) session.getAttribute("session_username");

            String session_password = (String) session.getAttribute("session_password");
            int session_user_id = (Integer) session.getAttribute("session_uid");

        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron abc\">\n");
      out.write("            <h3>E-Pass Traveller</h3>\n");
      out.write("            <p id=\"tagline\">Govt. Authorised E-Pass Services</p>\n");
      out.write("            <h3>Welcome ");
 out.print(session_username);
      out.write(" For E Travel Pass</h3>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <a href=\"ApplyForEPass.html\">Apply For E Pass</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <a href=\"DisplayApprovalPassStatus\">E Pass Approval Status</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <a href=\"EPassStatus\">On Hold</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <a href=\"EPassStatus\">On Hold</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
