<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<img width="400" height="300" src="../images/b.jpg" /> 这是第一张<br/>   
<img width="400" height="300" src="images/b.jpg" /> 这是第二张<br/>   
<img width="400" height="300" src="/images/b3.jpg" /> 这是第三张<br/>   
<img width="400" height="300" src="<%=request.getContextPath()%>/images/b.jpg" />  这是第四张<br/>   
<img width="400" height="300" src="PathTest/images/b.jpg" />  这是第五张<br/>    