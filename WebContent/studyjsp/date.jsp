<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>date</title>
</head>
<body>
<p>
   今天的日期是: <%= (new java.util.Date()).toLocaleString()%>
   <%! 
  private int initVar=0;
  private int serviceVar=0;
  private int destroyVar=0;
%>
  
<%!
  public void jspInit(){
    initVar++;
    System.out.println("jspInit(): JSP被初始化了"+initVar+"次");
  }
  public void jspDestroy(){
    destroyVar++;
    System.out.println("jspDestroy(): JSP被销毁了"+destroyVar+"次");
  }
%>

<%
  serviceVar++;
  System.out.println("_jspService(): JSP共响应了"+serviceVar+"次请求");

  String content1="初始化次数 : "+initVar;
  String content2="响应客户请求次数 : "+serviceVar;
  String content3="销毁次数 : "+destroyVar;
%>
<h1>菜鸟教程 JSP 测试实例</h1>
<p><%=content1 %></p>
<p><%=content2 %></p>
<p><%=content3 %></p>

<br>
<% out.println("your ip address is " + request.getRemoteAddr()); %>

JSP声明
<%! int i = 0; %>
<%! int a,b,c; %>

<%--该部分注释在网页中不被显示 --%>
<\%
%\>
\'
\"
<!-- 注释 -->


jsp声明<\%! declaration; [ declaration; ]+ ... \%>
jsp <%--该部分注释在网页中不被显示 --%>
</p>
</body>
</html>