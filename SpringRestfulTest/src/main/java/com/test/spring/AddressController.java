package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddressController {

	@Autowired private AddressDAO dao;
	
	//CRUD
	
	//요소 추가
	//1. http://localhost:80900/address
	//2. POST
	//3. return int
	
	//@RequestMapping(value="/address", method={RequestMethod.POST})
	@PostMapping("/address")
	@ResponseBody
	public int add(@RequestBody AddressDTO dto) {
		
		return dao.add(dto);
	}
	
	
	
	
}










