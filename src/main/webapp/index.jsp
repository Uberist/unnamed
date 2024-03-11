<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <style>
            body{
                background-color:palegoldenrod;
            }
        </style>
    </head>
    <body>
        <% String name = "hello World"; %>
        <div style="text-align:center">
            <h1 style="margin-top:50px; color:blue; margin-bottom: 70px">Welcome to our best marketplace!</h1>
            <form action="hello-servlet" method="post" style="display:inline-block;">
                <div style="display:inline-block;">
                        <div>
                            <label>select all</label><br>
                            <input name="selectAll" type="checkbox" value="selectAll">
                        </div>
                        <div>
                            <label>input min number</label><br>
                            <input name="minInt" type="number">
                        </div>
                        <div>
                            <label>select for name product</label><br>
                            <input name="nameProduct" type="text">
                        </div>
                        <div>
                            <label>exception name prduct</label><br>
                            <input name="noNameProduct" type="text">
                        </div>
                        <button type="submit" style="margin-top:10px"> select</button>
                </div>
            </form>
        </div>


        <br/>
        <a href="hello-servlet">Hello Servlet</a>
    </body>
</html>