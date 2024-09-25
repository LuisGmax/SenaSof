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
      out.write("    <title>Iniciar Sesión</title>\n");
      out.write("\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url('../imagenes/imagen.jpg');\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .login-container {\n");
      out.write("            max-width: 400px;\n");
      out.write("            margin: 100px auto;\n");
      out.write("            padding: 30px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("            opacity: 50%;\n");
      out.write("                \n");
      out.write("        }\n");
      out.write("        .login-title {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .error-message {\n");
      out.write("            color: red;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    ");

        String mensaje = "";
        if (request.getParameter("ingreso") != null) {
            int i = Integer.parseInt(request.getParameter("ingreso"));
            if (i == 0) {
                mensaje = "Error: Datos Incorrectos";
            }
        }
    
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("            <h2 class=\"login-title text-center\">Iniciar Sesión</h2>\n");
      out.write("            <form action=\"/SenaSof/CtrValidar\" method=\"post\">\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"text\" class=\"form-label\">Usuario</label>\n");
      out.write("                    <input type=\"text\" name=\"txtuser\" class=\"form-control\" id=\"email\" placeholder=\"pepito123\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"password\" class=\"form-label\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" name=\"txtpass\" class=\"form-control\" id=\"password\" placeholder=\"*******\" required>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn btn-primary btn-block\">\n");
      out.write("                    <p class=\"error-message\">");
      out.print( mensaje );
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"text-center mt-3\">\n");
      out.write("                <a class=\"btn btn-secondary\" href=\"/SenaSof/Vistas/regispac.jsp\">Registrar</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
