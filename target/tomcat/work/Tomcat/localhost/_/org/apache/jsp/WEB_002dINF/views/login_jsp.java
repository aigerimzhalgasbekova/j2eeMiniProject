/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-26 14:31:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/../common/header.jspf", Long.valueOf(1511706108000L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jspf", Long.valueOf(1511706239000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>Yahoo!!!</title>\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".footer {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tbottom: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 60px;\n");
      out.write("\tbackground-color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer .container {\n");
      out.write("\twidth: auto;\n");
      out.write("\tmax-width: 680px;\n");
      out.write("\tpadding: 0 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control{\n");
      out.write("\twidth: 30%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<nav role=\"navigation\" class=\"navbar navbar-inverse\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"\">\n");
      out.write("\t\t\t<a href=\"/\" class=\"navbar-brand\">J2EE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"navbar-collapse\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/list-todos.do\">Todos</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"https://www.linkedin.com/in/azhalgasbekova/\">LinkedIn</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li><a href=\"/login.do\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<form action=\"/login.do\" method=\"post\">\n");
      out.write("\t\t\t<p><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"exampleInputEmail1\">User Name</label> \n");
      out.write("\t\t\t\t<input\n");
      out.write("\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"exampleInputEmail1\"\n");
      out.write("\t\t\t\t\tplaceholder=\"Name\" name=\"name\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"exampleInputPassword1\">Password</label> <input\n");
      out.write("\t\t\t\t\ttype=\"password\" class=\"form-control\" id=\"exampleInputPassword1\"\n");
      out.write("\t\t\t\t\tplaceholder=\"Password\" name=\"password\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- Name: <input type=\"text\" name=\"name\"/>\n");
      out.write("\t\t\tPassword: <input type=\"password\" name=\"password\"/> -->\n");
      out.write("\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Login\"/>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<footer class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<p>Aigerim Zhalgasbekova</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\t<script src=\"webjars/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write('\n');
      out.write('	');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
