<%-- 
    Document   : login
    Created on : 23/09/2024, 04:48:07 PM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body, html {
            height: 100%;
            margin: 0;
            font-family: Arial, sans-serif;
        }
        .container {
            background-image: url('../imagenes/fondo.png');
            background-size: cover;
            background-position: center;
            height: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .login-form {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 8px;
            width: 300px;
        }
        .login-form h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        .form-group button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-group button:hover {
            background-color: #0056b3;
        }
    </style>
    <%String Mensaje = "";
    if (request.getParameter("ingreso")!= null){
        int i = Integer.parseInt(request.getParameter("ingreso"));
        if (i == 0){
            Mensaje = "Error: Datos Incorectos";
        }
    }
    %>
</head>
<body>
    <div class="container">
        <form class="login-form" action="/SenaSof/CtrValidar" method="post">
            <h2>LOGIN</h2>
            <div class="form-group">
                <label for="usuario">USUARIO</label>
                <input type="text" id="usuario"  name="txtuser" required>
            </div>
            <div class="form-group">
                <label for="contrasena">CONTRASEÑA</label>
                <input type="password" id="contrasena" name="txtpass" required>
            </div>
            <div class="form-group">
                <center>
                            <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
                            <p style="Color: red;"><%=Mensaje %></p>
                            <a class='btn btn-primary' href='../Vistas/regispac.jsp'>Quiero Registrarme</a>
                        </center> 
                            
            </div>
        </form>
    </div>
                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
