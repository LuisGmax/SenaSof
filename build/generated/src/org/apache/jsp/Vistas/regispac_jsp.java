package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regispac_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Ocean Conservation Registration</title>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            height: 100%;\n");
      out.write("            whidth: 100%;\n");
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
      out.write("        .form-container {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            width: 300px;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"], input[type=\"email\"], input[type=\"password\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #1a3c5e;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #15304d;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <h2>REGISTRARSE</h2>\n");
      out.write("            <form action=\"/SenaSof/CtrUsuario\" method=\"get\">\n");
      out.write("                <div>\n");
      out.write("                    <label>Numero Documento</label>\n");
      out.write("                <input type=\"text\" name=\"identificacion\" id=\"identificacion\" placeholder=\"0000000000\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>Nombres</label>\n");
      out.write("                <input type=\"text\" name=\"nombre\" placeholder=\"NOMBRE\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>Apellidos</label>\n");
      out.write("                <input type=\"text\" name=\"apellidos\" placeholder=\"Rodriguez \" required>\n");
      out.write("                </div>\n");
      out.write("                 <div>\n");
      out.write("                <label>Usuario</label>\n");
      out.write("                <input type=\"text\" name=\"usuario\" id=\"usuario\" placeholder=\"pepito123\" required>\n");
      out.write("                 </div>\n");
      out.write("                    <div>\n");
      out.write("                <label>Contraseña</label>\n");
      out.write("                <input type=\"password\" name=\"contrasena\" placeholder=\"CONTRASEÑA\" required>\n");
      out.write("                </div>\n");
      out.write("                 <div>\n");
      out.write("                <label>Correo</label>\n");
      out.write("                 <input type=\"email\" name=\"email\" placeholder=\"EMAIL\" required>\n");
      out.write("                  </div>\n");
      out.write("                 <div>\n");
      out.write("                 <label>Region</label>\n");
      out.write("                 <select name='IdRegion'>\n");
      out.write("                     <option value='2'>region caribe</option>\n");
      out.write("                     <option value='3'>region andina</option>\n");
      out.write("                     <option value='4'>region insular</option>\n");
      out.write("                     <option value='5'>region pacigfica</option>\n");
      out.write("                     <option value='6'>region amazonica</option>\n");
      out.write("                     <option value='7'>region orinoquia</option>\n");
      out.write("                 </select>\n");
      out.write("                </div>\n");
      out.write("                  <div>\n");
      out.write("                <label>Direccion</label>\n");
      out.write("                <input type=\"text\" name=\"direccion\" id=\"direccion\" placeholder=\"calle 97a # 6l-3\" required>\n");
      out.write("                 </div>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Registrarse\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
