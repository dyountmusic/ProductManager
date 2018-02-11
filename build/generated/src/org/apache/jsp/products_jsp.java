package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"globalstyle.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"productstablestyle.css\">\n");
      out.write("    <title>Products</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <p>User <a href=\"index\">Logout</a></p>\n");
      out.write("    \n");
      out.write("    <h1>Products</h1>\n");
      out.write("    <div>\n");
      out.write("        <table class=\"tg\">\n");
      out.write("            <tr>\n");
      out.write("                <th class=\"tg-e3zv\">Code</th>\n");
      out.write("                <th class=\"tg-9hbo\">Description</th>\n");
      out.write("                <th class=\"tg-9hbo\">Price</th>\n");
      out.write("                <th class=\"tg-yw4l\"></th>\n");
      out.write("                <th class=\"tg-yw4l\"></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tg-yw4l\">8601</td>\n");
      out.write("                <td class=\"tg-yw4l\">86 (the band) - True Life Songs and Pictures</td>\n");
      out.write("                <td class=\"tg-yw4l\">$15.96</td>\n");
      out.write("                <td class=\"tg-yw4l\">Edit</td>\n");
      out.write("                <td class=\"tg-yw4l\">Delete</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tg-yw4l\">pf01</td>\n");
      out.write("                <td class=\"tg-yw4l\">Paddlefoot - The first CD</td>\n");
      out.write("                <td class=\"tg-yw4l\">$12.95</td>\n");
      out.write("                <td class=\"tg-yw4l\">Edit</td>\n");
      out.write("                <td class=\"tg-yw4l\">Delete</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tg-yw4l\">pf02</td>\n");
      out.write("                <td class=\"tg-yw4l\">Paddlefood - The second CD</td>\n");
      out.write("                <td class=\"tg-yw4l\">$14.95</td>\n");
      out.write("                <td class=\"tg-yw4l\">Edit</td>\n");
      out.write("                <td class=\"tg-yw4l\">Delete</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tg-yw4l\">jr01</td>\n");
      out.write("                <td class=\"tg-yw4l\">Joe Rut - Genuine Wood Grained Finish</td>\n");
      out.write("                <td class=\"tg-yw4l\">$14.95</td>\n");
      out.write("                <td class=\"tg-yw4l\">Edit</td>\n");
      out.write("                <td class=\"tg-yw4l\">Delete</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <button>Add Product</button>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
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
