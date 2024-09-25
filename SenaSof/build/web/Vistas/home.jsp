<%-- 
    Document   : home
    Created on : 24/09/2024, 10:02:07 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi primera Encarta</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(to bottom, #4CAF50, #45a049);
            min-height: 100vh;
        }
        .header {
            background-color: #4CAF50;
        }
        .main-content {
            background: linear-gradient(to bottom right, #FFA500, #FF8C00);
            border-radius: 15px;
        }
        .category-btn {
            height: 80px;
            text-align: left;
            background-color: white;
            border: 2px solid #4CAF50;
        }
        .category-btn:hover {
            background-color: #e9f5e9;
        }
        .category-icon {
            background-color: #4CAF50;
            padding: 10px;
            border-radius: 50%;
            margin-right: 10px;
        }
    </style>
</head>
<body>
    <header class="header p-3">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-auto">
                    <button class="btn btn-warning rounded-circle me-2">
                        <i class="bi bi-house-fill"></i>
                    </button>
                    <button class="btn btn-success rounded-circle">
                        <i class="bi bi-arrow-left"></i>
                    </button>
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="Buscar">
                </div>
                <div class="col-auto">
                    <h5 class="text-white mb-0">Mi Primera Encarta</h5>
                </div>
                 <div class="text-center mb-4">
                     <video width="300" height="200" controls>
                    <source src="../imagenes/agua.mp4" type="video/mp4">
                    Tu navegador no soporta la etiqueta de video.
                </video>
            </div>
            </div>
        </div>
    </header>

    <main class="container my-4">
        <div class="main-content p-4">
            <h1 class="text-center text-white mb-4">Mi primera Encarta</h1>
            <div class="row g-3">
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-globe"></i></span>
                        Paisajes y regiones
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-clock-history"></i></span>
                        Historia
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-tree"></i></span>
                        Los seres vivos
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-people"></i></span>
                        Nuestra sociedad
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-flask"></i></span>
                        Ciencia y técnica
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-book"></i></span>
                        Lengua y literatura
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-calculator"></i></span>
                        Matemáticas
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-palette"></i></span>
                        Las artes
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-dribbble"></i></span>
                        Deportes
                    </button>
                </div>
                <div class="col-md-6">
                    <button class="btn category-btn w-100">
                        <span class="category-icon text-white"><i class="bi bi-puzzle"></i></span>
                        Juega y aprende
                    </button>
                </div>
            </div>
        </div>
    </main>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
