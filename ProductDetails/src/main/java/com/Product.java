package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Product() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver uploaded successful");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductDetails","root","Newp455#3201");
			System.out.println("Connected Successfully");
			Statement statement= con.createStatement();
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String search=request.getParameter("searchid");
			System.out.println(search);
			if(search==null) {
			out.print("you didn't give any product id for searching!<br>Try Again!");
			out.print("<br><a href= 'Details.html'>Go To Home Page</a>");
			}
			else {
			String sql = "SELECT * from Prod WHERE ProductId = '"+search+"';";
			ResultSet rs=statement.executeQuery(sql);
			if(rs.next()) {
			out.println("prod_id is "+rs.getInt(1)+" prod_name is "+rs.getString(2)+" price is"+rs.getInt(3));
			}
			else {
			out.println("There is no product id is found:"+search+"<br>Try Again");
			}
			out.println("<br>");
			out.println("<a href='Details.html'>Go To Home Page</a>");
			}
			}
			catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			}
			}
}


