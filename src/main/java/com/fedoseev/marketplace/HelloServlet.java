package com.fedoseev.marketplace;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.fedoseev.marketplace.Order;

import static java.lang.System.out;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        List<Order> ordersList = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "123" )){
            String query = "select * from orders;";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next())
                ordersList.add(new Order(resultSet.getInt(0),
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3) ));

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + ordersList.size() + "</h1>");
        out.println("</body></html>");
        // request.getRequestDispatcher("").forward(request, response);
    }

    public void destroy() {
    }
}