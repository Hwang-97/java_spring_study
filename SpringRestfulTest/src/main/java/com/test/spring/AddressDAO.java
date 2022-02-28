package com.test.spring;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDAO {

	@Autowired private SqlSessionTemplate template;

	public int add(AddressDTO dto) {
		
		return template.insert("address.add", dto);
	}
	
}
