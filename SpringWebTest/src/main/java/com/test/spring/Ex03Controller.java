package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//JSP Model2의 서블릿(컨트롤러) 역할
@Controller
public class Ex03Controller {
	
	//private DAO dao = new DAO();
	
	//doGet() or doPost()의 역할 > 요청 메소드
	//http://localhost:8090/spring/ex02.do
	@RequestMapping(value="/ex03.do")
	public String test() {

		//JSP 페이지 호출하기
		return "ex03";
		//return "/WEB-INF/views/ex02.jsp";
	}
	
	@RequestMapping(value="/ex03ok.do",method={RequestMethod.GET})
	public String callok(HttpServletRequest req, DTO dto) {
		
//		1 번째 방법
		/*
		 * String name = req.getParameter("name"); 
		 * String age = req.getParameter("age");
		 * String address = req.getParameter("address"); 
		 * DTO dto = new DTO();
		 * dto.setName(name); dto.setName(age); 
		 * dto.setName(address);
		 */
		
//		2 번째 방법
		/*
		 * DTO dto = new DTO(); 
		 * dto.setName(name); 
		 * dto.setName(age);
		 * dto.setName(address);
		 */
		
		//JSP 페이지 호출하기
		System.out.println(dto.toString());
		return "ex03ok";
		//return "/WEB-INF/views/ex02.jsp";
	}
}










