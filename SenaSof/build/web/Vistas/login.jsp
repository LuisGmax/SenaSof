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
    <title>Iniciar Sesión</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('../imagenes/imagen.jpg');
            
        }
        .login-container {
            max-width: 400px;
            margin: 100px auto;
            padding: 30px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            opacity: 50%;
                
        }
        .login-title {
            margin-bottom: 20px;
        }
        .error-message {
            color: red;
            text-align: center;
        }
    </style>
    <%
        String mensaje = "";
        if (request.getParameter("ingreso") != null) {
            int i = Integer.parseInt(request.getParameter("ingreso"));
            if (i == 0) {
                mensaje = "Error: Datos Incorrectos";
            }
        }
    %>
</head>
<body>
    <div class="container">
        <div class="login-container">
            <h2 class="login-title text-center">Iniciar Sesión</h2>
            <form action="/SenaSof/CtrValidar" method="post">
                <div class="mb-3">
                    <label for="text" class="form-label">Usuario</label>
                    <input type="text" name="txtuser" class="form-control" id="email" placeholder="pepito123" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Contraseña</label>
                    <input type="password" name="txtpass" class="form-control" id="password" placeholder="*******" required>
                </div>

                <div class="text-center">
                    <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
                    <p class="error-message"><%= mensaje %></p>
                </div>
            </form>
            <div class="text-center mt-3">
                <a class="btn btn-secondary" href="/SenaSof/Vistas/regispac.jsp">Registrar</a>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
