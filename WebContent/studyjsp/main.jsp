<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main</title>
</head>
<body>
	<c:set var="salary" scope="session" value="${2000*2}"/>
	<p>salary 变量值: <c:out value="${salary}"/></p>
	<c:remove var="salary"/>
	<p>删除 salary 变量后的值: <c:out value="${salary}"/></p>
	<c:out value="&lt要显示的数据对象（未使用转义字符）&gt" escapeXml="true" default="默认值"></c:out><br/>
	<c:out value="&lt要显示的数据对象（使用转义字符）&gt" escapeXml="false" default="默认值"></c:out><br />
	<c:out value="${null}" escapeXml="false">使用的表达式结果为null，则输出该默认值&gt</c:out><br />
	<c:out value="hello jstl"></c:out>
	<h2>include 动作实例</h2>
	<ex:Hello message="hello attr" />
	<jsp:include page="date.jsp" flush="true" />

	<jsp:useBean id="test" class="com.david.ssh.jsp.servlet.TestBean" />
	<jsp:setProperty name="test" property="message" value="菜鸟教程..." />
	<p>
		输出信息....
		<jsp:getProperty name="test" property="message" />
	</p>
	<jsp:useBean id="mytest" class="com.david.ssh.jsp.servlet.TestBean"></jsp:useBean>
	<jsp:setProperty property="message" name="mytest" value="hh" />
	<p>mytest:<jsp:getProperty property="message" name="mytest" /></p>
</body>
</html>