package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class send_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\t<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>Transfer Money</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("*{\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tfont-family: Times New Roman;\n");
      out.write("        font-weight: bold;\n");
      out.write("}\n");
      out.write("body,html\n");
      out.write("{\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write(".bg{\n");
      out.write("background-image:url(\"img/coins.png\");\n");
      out.write("height:100%;\n");
      out.write("background-position:center;\n");
      out.write("background-repeat:no-repeat;\n");
      out.write("background-size:cover;\n");
      out.write("}\n");
      out.write(".navi\n");
      out.write("{\n");
      out.write("float:left;\n");
      out.write("padding-left:50px;\n");
      out.write("font-size:40px;\n");
      out.write("font-family:Times New Roman;\n");
      out.write("color:black;\n");
      out.write("margin-top: 8px;\n");
      out.write("}\n");
      out.write(".navbar\n");
      out.write("{\n");
      out.write("float:right;\n");
      out.write("padding:7px;\n");
      out.write("padding-right:40px;\n");
      out.write("margin-top: 8px;\n");
      out.write("}\n");
      out.write(".navbar a\n");
      out.write("{\n");
      out.write("font-size:25px;\n");
      out.write("padding-right:40px;\n");
      out.write("text-decoration:none;\n");
      out.write("color: black;\n");
      out.write("font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover\n");
      out.write("{\n");
      out.write("\tcolor:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".container\n");
      out.write("{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: row;\n");
      out.write("\talign-items: center;\n");
      out.write("\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tpadding: 40px;\n");
      out.write("\t\n");
      out.write("\tbox-shadow:  0 50px 50px -1px darkslategrey;\n");
      out.write("}\n");
      out.write(".user\n");
      out.write("{\n");
      out.write("   width: 270px;\n");
      out.write("   margin-right: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.container div.user h2\n");
      out.write("{\n");
      out.write("\tcolor: black;\n");
      out.write("\tmargin-bottom: 20px ;\n");
      out.write("                  font-size: 35px;\n");
      out.write("                  text-align: -webkit-center;\n");
      out.write("                  text-shadow: 0 0 3px #73d7ee, 0 0 5px #13257b;\n");
      out.write("}\n");
      out.write("div.container div.user input\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder-bottom: 2px solid  #1c1c1e;\n");
      out.write("\tmargin-bottom: 25px;\n");
      out.write("\tpadding: 9px 0;\n");
      out.write("\tfont-size: 17px;\n");
      out.write("}\n");
      out.write("div.container div.user button\n");
      out.write("{\n");
      out.write("\tcolor: white;\n");
      out.write("\tbackground-color: #1c1c1e;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 3p;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tpadding: 2px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer{\n");
      out.write("background-color:black;\n");
      out.write("color:white;\n");
      out.write("height:50px;\n");
      out.write("margin-top:650px;\n");
      out.write("bottom: 5px;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("p {\n");
      out.write("    padding-top: 7px;\n");
      out.write("}\n");
      out.write("b \n");
      out.write("{\n");
      out.write("    font-weight: bold;\n");
      out.write("color:black;\n");
      out.write("  }\n");
      out.write("img{\n");
      out.write("    width: 300px;\n");
      out.write("   height:275px;  \n");
      out.write("display:block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
String email=request.getParameter("email");
      out.write("\n");
      out.write("    <div class=\"bg\">\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<span class=\"navi\">\n");
      out.write("<b>INDORE BANK</b>\n");
      out.write("</span>\n");
      out.write("<span class=\"navbar\">\n");
      out.write("<a href=\"index.html\">Home</a>\n");
      out.write("<a href=\"adduser.jsp\">Add Customer</a>\n");
      out.write("<a href=\"view.jsp\">View User</a>\n");
      out.write("<a href=\"transfer.jsp\">Transfer Money</a>\n");
      out.write("<a href=\"checkhistory.jsp\">Check History</a>\n");
      out.write("</span>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"user\">\n");
      out.write("\t\t\t<form action=\"SendServlet\" method=\"POST\">\n");
      out.write("                            ");
String a = (String)request.getAttribute("message");
     if(a!=null){
     out.println("<FONT COLOR=RED>" + a + "</FONT>"); 
     out.println();}

      out.write("\n");
      out.write("\t\t\t\t<h2>TRANSFER MONEY</h2>\n");
      out.write("                                <label for=\"rname\"><font color=\"black\" style=\"font-size:20px;\">Receiver's Account:</font></label>\n");
      out.write("                                <input type=\"email\" name=\"receiver\" id=\"name\" value=\"");
out.println(email);
      out.write("\" readonly=\"readonly\"><br>\n");
      out.write("                                <label for=\"sname\"><font color=\"black\" style=\"font-size:20px;\">Sender's Account:</font></label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"sender\" name=\"name\" id=\"rname\"><br>\n");
      out.write("                                <label for=\"amnt\"><font color=\"black\" style=\"font-size:20px;\">Amount:</font></label>\n");
      out.write("\t\t\t\t<input type=\"balance\" id=\"amnt\" name=\"amount\">\n");
      out.write("<br>\n");
      out.write("\t\t\t\t<button name=\"submit\" style=\"margin-right:50px; color: white;background-color: black; \">SEND</button>\n");
      out.write("                             \n");
      out.write("\t\t\t\t<button name=\"reset\" style=\"margin-right:50px; color: white;background-color: black; display: inline-block; \">BACK</button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"ime\" style=\"border:1px solid black;\">\n");
      out.write("\t\t\t<img src=\"img/blue.png\" width=\"300px\" >\n");
      out.write("\t\t</div>\n");
      out.write("\t</div><br>\n");
      out.write("\n");
      out.write("<footer><center>\n");
      out.write("        <p>&copy 2021. Made by <font color=\"white\"<b>Geetika Singh Rathore</b> </font><br> The Sparks Foundation</p>\n");
      out.write("</center>\n");
      out.write("</footer>\n");
      out.write("</div>\n");
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
