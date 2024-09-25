package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Protecting drops</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url('../imagenes/fondo.png');\n");
      out.write("            background: linear-gradient(to bottom, #4CAF50, #45a049);\n");
      out.write("            min-height: 100vh;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("        }\n");
      out.write("        .main-content {\n");
      out.write("            background: linear-gradient(to bottom right, #FFA500, #FF8C00);\n");
      out.write("            border-radius: 15px;\n");
      out.write("        }\n");
      out.write("        .category-btn {\n");
      out.write("            height: 80px;\n");
      out.write("            text-align: left;\n");
      out.write("            background-color: white;\n");
      out.write("            border: 2px solid #4CAF50;\n");
      out.write("        }\n");
      out.write("        .category-btn:hover {\n");
      out.write("            background-color: #e9f5e9;\n");
      out.write("        }\n");
      out.write("        .category-icon {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            margin-right: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"header p-3\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("                <div class=\"col-auto\">\n");
      out.write("                    <button class=\"btn btn-warning rounded-circle me-2\">\n");
      out.write("                        <i class=\"bi bi-house-fill\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"btn btn-success rounded-circle\">\n");
      out.write("                        <i class=\"bi bi-arrow-left\"></i>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Buscar\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-auto\">\n");
      out.write("                    <h5 class=\"text-white mb-0\">Mi Primera Encarta</h5>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"text-center mb-4\">\n");
      out.write("                     <video width=\"300\" height=\"200\" controls>\n");
      out.write("                    <source src=\"../imagenes/agua.mp4\" type=\"video/mp4\">\n");
      out.write("                    Tu navegador no soporta la etiqueta de video.\n");
      out.write("                </video>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main class=\"container my-4\">\n");
      out.write("        <div class=\"main-content p-4\">\n");
      out.write("            <h1 class=\"text-center text-white mb-4\">Protecting drops</h1>\n");
      out.write("            <div class=\"row g-3\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-globe\"></i></span>\n");
      out.write("                        Paisajes y regiones\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-clock-history\"></i></span>\n");
      out.write("                        Historia\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-tree\"></i></span>\n");
      out.write("                        Los seres vivos\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-people\"></i></span>\n");
      out.write("                        Nuestra sociedad\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-flask\"></i></span>\n");
      out.write("                        Ciencia y técnica\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-book\"></i></span>\n");
      out.write("                        Lengua y literatura\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-calculator\"></i></span>\n");
      out.write("                        Matemáticas\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-palette\"></i></span>\n");
      out.write("                        Las artes\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-dribbble\"></i></span>\n");
      out.write("                        Deportes\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button class=\"btn category-btn w-100\">\n");
      out.write("                        <span class=\"category-icon text-white\"><i class=\"bi bi-puzzle\"></i></span>\n");
      out.write("                        Juega y aprende\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
