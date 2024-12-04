package com.adhikrit.springboot.myfirstwebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"say-hello" => "Hello! What are you learning today?"
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHello() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first Html Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML Page with body");
		sb.append("</body>");
		sb.append("</html>");
//		return "Hello! What are you learning today?";
		return sb.toString();
	}
	
	
	// "say-hello-jsp" => sayHello.jsp 
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
