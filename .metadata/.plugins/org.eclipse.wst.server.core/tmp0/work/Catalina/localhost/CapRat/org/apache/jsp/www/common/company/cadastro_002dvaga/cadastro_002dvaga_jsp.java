/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2021-05-01 18:56:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.www.common.company.cadastro_002dvaga;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_002dvaga_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/www/common/company/cadastro-vaga/../../../header/v1/header.jsp", Long.valueOf(1619894978408L));
    _jspx_dependants.put("/www/common/company/cadastro-vaga/../../../footer/footer.jsp", Long.valueOf(1618526124651L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\t<html>\n");
      out.write("\t    <head>\n");
      out.write("\t        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t        <meta charset=\"UTF-8\">\n");
      out.write("\t        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("\t        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat&display=swap\" rel=\"stylesheet\">\n");
      out.write("\t        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../../header/v1/css/style.css\">\n");
      out.write("\t        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../../footer/css/style.css\">\n");
      out.write("\t        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\t        <title></title>\n");
      out.write("\t    </head>\n");
      out.write("\t    <body>\n");
      out.write("\t        <div class=\"body-header\">\n");
      out.write("\t            <header>\n");
      out.write("\t                <a href=\"#\" class=\"logo\">CAP<span>RAT</span></a>\n");
      out.write("\t                <ul class=\"navigation\">\n");
      out.write("\t                    <li><a href=\"#\">Início</a></li>\n");
      out.write("\t                    <li><a href=\"#\">Vagas</a></li>\n");
      out.write("\t                    <li><a href=\"#\">Sobre</a></li>\n");
      out.write("\t                    <li><a href=\"#\">Perfil</a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t                <div class=\"search\">\n");
      out.write("\t                    <input type=\"text\" placeholder=\"Busque aqui\">\n");
      out.write("\t                    <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("\t                </div>\n");
      out.write("\t                <ul class=\"user-navigation\">\n");
      out.write("\t                    <li id=\"user-photo\"><a href=\"#\"><i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t                    <li id=\"user-photo\"><a href=\"#\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t            </header>\n");
      out.write("\t        </div>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("\t<div class=\"content\">\n");
      out.write("\t\t<div class=\"depoimento\">\n");
      out.write("        <h1>Depoimentos</h1>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"membro\">\n");
      out.write("                <div class=\"user_img\">\n");
      out.write("                    <img src=\"assets/team2.png\" alt=\"user_image\">\n");
      out.write("                </div>\n");
      out.write("                <h3>Empresa</h3>\n");
      out.write("                <p class=\"cargo\">Ramo</p>\n");
      out.write("                <p class=\"depoimento\">texto foda sobre como minha empresa conseguiu empregados fodas com esse site foda de vagas incrivelmente foda</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"membro\">\n");
      out.write("                <div class=\"user_img\">\n");
      out.write("                    <img src=\"assets/team1.png\" alt=\"user_image\">\n");
      out.write("                </div>\n");
      out.write("                <h3>Empresa</h3>\n");
      out.write("                <p class=\"cargo\">Ramo</p>\n");
      out.write("                <p class=\"depoimento\">texto foda sobre como minha empresa conseguiu empregados fodas com esse site foda de vagas incrivelmente foda</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"membro\">\n");
      out.write("                <div class=\"user_img\">\n");
      out.write("                    <img src=\"assets/team3.png\" alt=\"user_image\">\n");
      out.write("                </div>\n");
      out.write("                <h3>Empresa</h3>\n");
      out.write("                <p class=\"cargo\">Ramo</p>\n");
      out.write("                <p class=\"depoimento\">texto foda sobre como minha empresa conseguiu empregados fodas com esse site foda de vagas incrivelmente foda</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"wave\">\n");
      out.write("\t\t<div class=\"custom-shape-divider-top-1618457940\">\n");
      out.write("\t\t    <svg data-name=\"Layer 1\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 1200 120\" preserveAspectRatio=\"none\">\n");
      out.write("\t\t        <path d=\"M985.66,92.83C906.67,72,823.78,31,743.84,14.19c-82.26-17.34-168.06-16.33-250.45.39-57.84,11.73-114,31.07-172,41.86A600.21,600.21,0,0,1,0,27.35V120H1200V95.8C1132.19,118.92,1055.71,111.31,985.66,92.83Z\" class=\"shape-fill\"></path>\n");
      out.write("\t\t    </svg>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"form-content\">\n");
      out.write("\t\t<div class=\"side-image\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"side-form\">\n");
      out.write("\t\t\t<div class=\"cadastro\">\n");
      out.write("\t\t        <h2>Cadastro</h2>\n");
      out.write("\t\t        <form action=\"\">\n");
      out.write("\t\t            <h4>Título</h4>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <input type=\"text\" placeholder=\"Título da vaga\" required class=\"name\">\n");
      out.write("\t\t                    <i class=\"fa fa-etsy icon\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <h4>Descrição</h4>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <textarea id=\"descricao\" name=\"descricao\">\n");
      out.write("\t\t                    </textarea>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <h4>Endereço</h4>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <input type=\"text\" placeholder=\"Estado\" required class=\"name\">\n");
      out.write("\t\t                    <i class=\"fa fa-map icon\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <input type=\"text\" placeholder=\"Cidade\" required class=\"name\">\n");
      out.write("\t\t                    <i class=\"fa fa-map-signs icon\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <input type=\"text\" placeholder=\"Logradouro\" required class=\"name\">\n");
      out.write("\t\t                    <i class=\"fa fa-map-marker icon\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <h4>Requisitos</h4>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <textarea id=\"descricao\" name=\"descricao\">\n");
      out.write("\t\t                    </textarea>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <h4>Salário</h4>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <input type=\"text\" placeholder=\"Ex: R$1.500,00 \" required class=\"name\">\n");
      out.write("\t\t                    <i class=\"fa fa-money icon\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <h4>Nível de experiência</h4>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <input type=\"text\" placeholder=\"Ex: Desenvolvedor Pleno\" required class=\"name\">\n");
      out.write("\t\t                    <i class=\"fa fa-plus icon\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"input-group\">\n");
      out.write("\t\t                <div class=\"input-box\">\n");
      out.write("\t\t                    <button type=\"submit\">CADASTRAR VAGA</button>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t        </form>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"body-footer\">\n");
      out.write("\t            <footer>\n");
      out.write("\t                <div class=\"container\">\n");
      out.write("\t                    <div class=\"sec about-us\" align=\"center\">\n");
      out.write("\t                        <h2>Sobre <span id=\"bolder\">Nós</span></h2>\n");
      out.write("\t                        <p>\n");
      out.write("\t                            Somos uma comunidade que tem o propósito de contribuir para um mundo em que empresas escolhem melhor as pessoas e pessoas escolhem melhor as empresas. \n");
      out.write("\t                        </p>\n");
      out.write("\t                        <ul class=\"sci\" align=\"center\">\n");
      out.write("\t                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t                            <li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t                            <li><a href=\"#\"><i class=\"fa fa-youtube-play\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t                            <li><a href=\"#\"><i class=\"fa fa-github\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </div>\n");
      out.write("\t                    <div class=\"sec know-more\" align=\"center\">\n");
      out.write("\t                        <h2>Saiba <span id=\"bolder\">Mais</span></h2>\n");
      out.write("\t                        <ul>\n");
      out.write("\t                            <li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t                            <li><a href=\"#\">Política de Privacidade</a></li>\n");
      out.write("\t                            <li><a href=\"#\">Nosso negócio</a></li>\n");
      out.write("\t                            <li><a href=\"#\">Trabalhe conosco</a></li>\n");
      out.write("\t                            <li><a href=\"#\">Contato</a></li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </div>\n");
      out.write("\t                    <div class=\"sec talk-to-us\" align=\"center\">\n");
      out.write("\t                        <h2>Fale <span id=\"bolder\">Conosco</span></h2>\n");
      out.write("\t                        <ul class=\"info\">\n");
      out.write("\t                            <li>\n");
      out.write("\t                                <span><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t                                <p><a href=\"mailto: reply@capratvagas.com.br\">reply@capratvagas.com.br</a></p>\n");
      out.write("\t                            </li>\n");
      out.write("\t                            <li>\n");
      out.write("\t                                <span><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t                                <p><a href=\"tel: 551125658450\">+55 11 2565-8450</a></p>\n");
      out.write("\t                            </li>\n");
      out.write("\t                            <li>\n");
      out.write("\t                                <span><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t                                <span>Av. Salgado Filho, 3501 <br>Guarulhos, São Paulo, <br>Brasil</span>\n");
      out.write("\t                            </li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </div>\n");
      out.write("\t                </div>\n");
      out.write("\t            </footer>\n");
      out.write("\t            <div class=\"copyright\">\n");
      out.write("\t               <p>© Copyright 2021 CAPRAT. Todos os direitos reservados.</p> \n");
      out.write("\t            </div>\n");
      out.write("\t        </div>\n");
      out.write("\t    </body>\n");
      out.write("\t</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
