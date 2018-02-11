package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"globalstyle.css\">\n");
      out.write("\n");
      out.write("    <title>Signup</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h1>Sign-up form</h1>\n");
      out.write("    <div>\n");
      out.write("        <label><strong>First Name</strong></label>\n");
      out.write("        <input type=\"text\">\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <label><strong>Last Name</strong></label>\n");
      out.write("        <input type=\"text\">\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <label><strong>Email</strong></label>\n");
      out.write("        <input type=\"text\">\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <label><strong>Username</strong></label>\n");
      out.write("        <input type=\"text\">\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <label><strong>Password</strong></label>\n");
      out.write("        <input type=\"text\">\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Sign up\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <br>\n");
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
