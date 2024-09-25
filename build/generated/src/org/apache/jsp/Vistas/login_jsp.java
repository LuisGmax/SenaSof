package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <style>\n");
      out.write("        body, html {\n");
      out.write("            height: 100%;\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            background-image: url('../imagenes/fondo.png');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("            height: 100%;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .login-form {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            width: 300px;\n");
      out.write("        }\n");
      out.write("        .login-form h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("        .form-group input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .form-group button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .form-group button:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    ");
String Mensaje = "";
    if (request.getParameter("ingreso")!= null){
        int i = Integer.parseInt(request.getParameter("ingreso"));
        if (i == 0){
            Mensaje = "Error: Datos Incorectos";
        }
    }
    
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form class=\"login-form\" action=\"/SenaSof/CtrValidar\" method=\"post\">\n");
      out.write("            <h2>LOGIN</h2>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"usuario\">USUARIO</label>\n");
      out.write("                <input type=\"text\" id=\"usuario\"  name=\"txtuser\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"contrasena\">CONTRASEÑA</label>\n");
      out.write("                <input type=\"password\" id=\"contrasena\" name=\"txtpass\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <center>\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn btn-primary btn-block\">\n");
      out.write("                            <p style=\"Color: red;\">");
      out.print(Mensaje );
      out.write("</p>\n");
      out.write("                            <a class='btn btn-primary' href='../Vistas/regispac.jsp'>Quiero Registrarme</a>\n");
      out.write("                        </center> \n");
      out.write("                            \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("                        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
