package Controlador;

import Modelos.Usuario;
import Modelos.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author SENA
 */
@WebServlet(name = "CtrUsuario", urlPatterns = {"/CtrUsuario"})
public class CtrUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    UsuarioDAO dao = new UsuarioDAO();
    Usuario us = new Usuario();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CtrUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CtrUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static String encriptarcontrasena(String password) {
        String passwordencriptado = BCrypt.hashpw(password, BCrypt.gensalt());
        return passwordencriptado;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        List<Usuario> list = dao.listar();
        String id, nomb, ape, usu, pas, ema, dir, reg;
        String accion = request.getParameter("accion");
        System.out.println("accion: " + accion);
        switch (accion) {
            case "Listar":
                list = dao.listar();
                request.setAttribute("usuarios", list);

                request.getRequestDispatcher("/Vistas/ListarUsuario.jsp").forward(request, response);
                break;
            case "buscar":
                String nom = request.getParameter("txtbuscar");
                list = dao.listar(nom);
                request.setAttribute("usuarios", list);
                request.getRequestDispatcher("/Vistas/ListarUsuario.jsp").forward(request, response);
                break;
            case "Registrarse":
                // Obtener parámetros de la solicitud
                id = request.getParameter("identificacion");
                nomb = request.getParameter("nombre");
                ape = request.getParameter("apellidos");
                usu = request.getParameter("usuario");
                pas = request.getParameter("contrasena");
                ema = request.getParameter("email");
                reg = request.getParameter("IdRegion");
                dir = request.getParameter("direccion");

                // Configurar el usuario
                us.setId(id);
                us.setNombres(nomb);
                us.setApellidos(ape);
                us.setUsuario(usu);
                us.setContrasena(encriptarcontrasena(pas));
                us.setEmail(ema);
                us.setIdRegion(reg);
                us.setDireccion(dir);

                // Guardar usuario en la base de datos
                dao.crear(us);

                Properties propiedades = new Properties();
                propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
                propiedades.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
                propiedades.setProperty("mail.smtp.starttls.enable", "true");
                propiedades.setProperty("mail.smtp.port", "587");
                propiedades.setProperty("mail.smtp.auth", "true");

// Crear sesión
                Session session = Session.getInstance(propiedades, new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("progectingdrops@gmail.com", "izycnzjrdbnwqfea");
                    }
                });

                String destinatario = ema; // Obtener el email del usuario registrado
                String asunto = "Bienvenido " + us.getNombres() + ", gracias por registrarse en nuestra aplicación";
              String mensaje = "";
                if(us.getIdRegion().equals("region amazonica")){
                   mensaje = "<h1>Hidrografia Del Amazonas</h1><br/>" +
                           "<h3>aca te brindamos informacion clave sobre el agua en tu region </h3>"+
                 "<video width='100' controls>" +
                 "<source src='../imagenes/agua.mp4' type='video/mp4'>" +
                 "<a href='https://es.wikipedia.org/wiki/Regi%C3%B3n_Amaz%C3%B3nica_(Colombia)#Hidrograf%C3%ADa'>Ver Video</a>"+
                 "</video>";
               }else if(us.getIdRegion().equals("region andina")){
                    mensaje = "<h1>Region Andina</h1><br/>" +
                             "<h3>aca te brindamos informacion clave sobre el agua en tu region </h3>"+
                 "<video width='100' controls>" +
                 "<source src='' type='video/mp4'>" +
                 "<a href='https://es.wikipedia.org/wiki/Regi%C3%B3n_Andina_(Colombia)'>Ver Video</a>"+
                 "</video>";
               }else if(us.getIdRegion().equals("region orinoquia")){
                    mensaje = "<h1>Region orinoquia</h1><br/>" +
                             "<h3>aca te brindamos informacion clave sobre el agua en tu region </h3>"+
                 "<video width='100' controls>" +
                 "<source src='' type='video/mp4'>" +
                 "<a href='https://es.wikipedia.org/wiki/Regi%C3%B3n_de_la_Orinoqu%C3%ADa_(Colombia)'>Ver Video</a>"+
                 "</video>";
               }else if(us.getIdRegion().equals("region pacigfica")){
                    mensaje = "<h1>Region pacifico</h1><br/>" +
                             "<h3>aca te brindamos informacion clave sobre el agua en tu region </h3>"+
                 "<video width='100' controls>" +
                 "<source src='' type='video/mp4'>" +
                 "<a href='https://es.wikipedia.org/wiki/Regi%C3%B3n_del_Pac%C3%ADfico_(Colombia)'>Ver Video</a>"+
                 "</video>";
               }else if(us.getIdRegion().equals("region caribe")){
                    mensaje = "<h1>Region caribe</h1><br/>" +
                             "<h3>aca te brindamos informacion clave sobre el agua en tu region </h3>"+
                 "<video width='100' controls>" +
                 "<source src='' type='video/mp4'>" +
                 "<a href='https://es.wikipedia.org/wiki/Regi%C3%B3n_Caribe_(Colombia)'>Ver Video</a>"+
                 "</video>";
               }
// Configurar el mensaje para que sea HTML
                try {
                    MimeMessage mail = new MimeMessage(session);
                    mail.setFrom(new InternetAddress("progectingdrops@gmail.com"));
                    mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                    mail.setSubject(asunto);
                    
                    mail.setContent(mensaje, "text/html"); // Establecer el contenido como HTML

                    // Enviar el correo
                    Transport.send(mail);
                    System.out.println("Correo enviado exitosamente.");

                } catch (Exception e) {
                    System.out.println("Error al enviar el correo: " + e.getMessage());
                }

                // Redirigir al login
                request.setAttribute("usuarios", list);
                request.getRequestDispatcher("Vistas/login.jsp").forward(request, response);
                break;

            case "editar":
                String idusu = request.getParameter("id");
                us = dao.list(idusu);
                request.setAttribute("usuarios", us);
                System.out.println("contrasena: " + us.getContrasena());
                request.getRequestDispatcher("/Vistas/EditarUsuario.jsp").forward(request, response);
                break;
            case "actualizar":
                id = request.getParameter("identificacion");
                nomb = request.getParameter("nombre");

                usu = request.getParameter("usuario");
                pas = request.getParameter("contrasena");

                us.setId(id);
                us.setNombres(nomb);

                us.setUsuario(usu);
                us.setContrasena(pas);

                dao.editar(us);
                list = dao.listar();
                request.setAttribute("usuarios", list);
                request.getRequestDispatcher("Vistas/ListarUsuario.jsp").forward(request, response);
                break;
            case "eliminar":
                id = request.getParameter("id");
                System.out.println("identificacion: " + id);
                dao.eliminar(id);
                list = dao.listar();
                request.setAttribute("usuarios", list);
                request.getRequestDispatcher("Vistas/ListarUsuario.jsp").forward(request, response);
                break;
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
