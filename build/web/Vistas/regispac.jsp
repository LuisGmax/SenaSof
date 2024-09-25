<%-- 
    Document   : regispac
    Created on : 24/09/2024, 11:19:06 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ocean Conservation Registration</title>
    <style>
        body{
            height: 100%;
            whidth: 100%;
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
        .form-container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 10px;
            width: 300px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #1a3c5e;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #15304d;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form-container">
            <h2>REGISTRARSE</h2>
            <form action="/SenaSof/CtrUsuario" method="get">
                <div>
                    <label>Numero Documento</label>
                <input type="text" name="identificacion" id="identificacion" placeholder="0000000000" required>
                </div>
                <div>
                    <label>Nombres</label>
                <input type="text" name="nombre" placeholder="NOMBRE" required>
                </div>
                <div>
                    <label>Apellidos</label>
                <input type="text" name="apellidos" placeholder="Rodriguez " required>
                </div>
                 <div>
                <label>Usuario</label>
                <input type="text" name="usuario" id="usuario" placeholder="pepito123" required>
                 </div>
                    <div>
                <label>Contraseña</label>
                <input type="password" name="contrasena" placeholder="CONTRASEÑA" required>
                </div>
                 <div>
                <label>Correo</label>
                 <input type="email" name="email" placeholder="EMAIL" required>
                  </div>
                 <div>
                 <label>Region</label>
                 <select name='IdRegion'>
                     <option value='2'>region caribe</option>
                     <option value='3'>region andina</option>
                     <option value='4'>region insular</option>
                     <option value='5'>region pacigfica</option>
                     <option value='6'>region amazonica</option>
                     <option value='7'>region orinoquia</option>
                 </select>
                </div>
                  <div>
                <label>Direccion</label>
                <input type="text" name="direccion" id="direccion" placeholder="calle 97a # 6l-3" required>
                 </div>
                <input type="submit" name="accion" value="Registrarse">
            </form>
        </div>
    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>