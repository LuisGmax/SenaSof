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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"/SenaSof/CtrUsuario\" method=\"GET\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"text\" class=\"form-label\">Identificacion</label>\n");
      out.write("                <input type=\"text\" name=\"identificacion\" class=\"form-control\" id=\"identificacion\" placeholder=\"1234567890\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"text\" class=\"form-label\">Nombre</label>\n");
      out.write("                <input type=\"text\" name=\"nombre\" class=\"form-control\" id=\"nombre\" placeholder=\"juan andres\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"text\" class=\"form-label\">Usuario</label>\n");
      out.write("                <input type=\"text\" name=\"usuario\" class=\"form-control\" id=\"usuario\" placeholder=\"pepito123\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"password\" class=\"form-label\">Contraseña</label>\n");
      out.write("                <input type=\"password\" name=\"contrasena\" class=\"form-control\" id=\"contrasena\" placeholder=\"Contraseña\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"email\" class=\"form-label\">Contraseña</label>\n");
      out.write("                <input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"adbja@gmail.com\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <center>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Registrar\" class=\"btn btn-primary btn-block\">\n");
      out.write("\n");
      out.write("            </center> \n");
      out.write("        </form>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
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
