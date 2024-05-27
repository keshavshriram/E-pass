
<%@page import="java.sql.*" %>

<%
    
    try {
        int epass_id = Integer.parseInt(request.getParameter("epass_id"));
        out.println(epass_id);
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/epass_db";
        String user = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement("update epass set travel_status='Accepted' where epass_id=" + epass_id);
        ps.executeUpdate();
        
        response.sendRedirect("Applied_For_EPass");
    } catch (Exception e) {
        out.println(e);
    }
%>
