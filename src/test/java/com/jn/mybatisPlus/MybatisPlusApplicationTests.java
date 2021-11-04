package com.jn.mybatisPlus;

import com.jn.mybatisPlus.entity.User;
import com.jn.mybatisPlus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
		System.out.println("----- selectAll method test ------");
		List<User> userList = userMapper.selectList(null);
		System.out.println("userList.size="+userList.size());
		for(User user:userList){
			System.out.println(user);
		}
	}

}
