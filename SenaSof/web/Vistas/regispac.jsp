<%-- 
    Document   : regispac
    Created on : 24/09/2024, 11:19:06 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="/SenaSof/CtrUsuario" method="GET">
            <div class="mb-3">
                <label for="text" class="form-label">Identificacion</label>
                <input type="text" name="identificacion" class="form-control" id="identificacion" placeholder="1234567890" required>
            </div>
            <div class="mb-3">
                <label for="text" class="form-label">Nombre</label>
                <input type="text" name="nombre" class="form-control" id="nombre" placeholder="juan andres" required>
            </div>
            <div class="mb-3">
                <label for="text" class="form-label">Usuario</label>
                <input type="text" name="usuario" class="form-control" id="usuario" placeholder="pepito123" required>
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Contraseña</label>
                <input type="password" name="contrasena" class="form-control" id="contrasena" placeholder="Contraseña" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Contraseña</label>
                <input type="email" name="email" class="form-control" id="email" placeholder="adbja@gmail.com" required>
            </div>


            <center>
                <input type="submit" name="accion" value="Registrar" class="btn btn-primary btn-block">

            </center> 
        </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
