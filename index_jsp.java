package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <!-- <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/fontawesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("       --> \n");
      out.write("       <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script>\n");
      out.write("        <title>Online Examination System</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row bg-warning text-light\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-4\">Helpline No:+91-9991992922</div>\n");
      out.write("                <div class=\"col-sm-4\">Mail Us:nouonlineexa@gmail.com</div>\n");
      out.write("                <div class=\"col-sm-4\">Follow Us</div>\n");
      out.write("                \n");
      out.write("            </div><!--end of row-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12 mt-2\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">NOU-OES</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">About us</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Registration</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Login</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Contact us</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row mt-2\">\n");
      out.write("                    <div id=\"carouselExampleCaptions\" class=\"carousel slide\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("        <img src=\"images/s1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>First slide label</h5>\n");
      out.write("        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("        <img src=\"images/s2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>Second slide label</h5>\n");
      out.write("        <p>Some representative placeholder content for the second slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("        <img src=\"images/s3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>Third slide label</h5>\n");
      out.write("        <p>Some representative placeholder content for the third slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("                </div><!--end of row-->\n");
      out.write("                <div class=\"row mt-2\">\n");
      out.write("                    <div class=\"col-sm-4\" style=\"min-height: 600px; background-color: aqua;\"></div>\n");
      out.write("                    <div class=\"col-sm-8\" style=\"min-height: 600px; background-color: aliceblue;\"></div>\n");
      out.write("                </div><!--end of row-->\n");
      out.write("                <div class=\"row mt-2\">\n");
      out.write("                    <div class=\"col-sm-4\" style=\"min-height: 250px;background-color:\">\n");
      out.write("                        <h4>address</h4>\n");
      out.write("                        <ul>\n");
      out.write("                    <li>829915787</li>\n");
      out.write("                    <li>ravi@gmail</li>\n");
      out.write("                    <li>Softpro Learning Center\n");
      out.write("                      3/213, Gudamba Thaana Rd, Sector J, Jankipuram, Lucknow, Uttar Pradesh 226021</li>\n");
      out.write("                  </ul>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\" style=\"min-height: 250px;background-color:;\">\n");
      out.write("                        <h4>useful link</h4>\n");
      out.write("                  <ul>\n");
      out.write("                    <li>\n");
      out.write("                      <a href=\"#\">URISE</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a href=\"\">BTEUP</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"\">up cmo</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\" style=\"min-height: 250px;background-color:;\">\n");
      out.write("                        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3557.3586983511736!2d80.96201571436606!3d26.923840766094024!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x399bfd7e0637bf21%3A0x730fe46201abc68a!2sSoftpro%20Learning%20Center!5e0!3m2!1sen!2sin!4v1660718739085!5m2!1sen!2sin\" style=\"border:0; height: 300px; width: 100%;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--end of row as footer-->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div><!--end of container-->\n");
      out.write("        \n");
      out.write("        \n");
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
