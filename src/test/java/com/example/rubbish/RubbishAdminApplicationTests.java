package com.example.rubbish;

import com.example.rubbish.controller.RubbishController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RubbishAdminApplicationTests {
	@Autowired
	RubbishController rubbishController;
	@Test
	void contextLoads() {

	}

	@Test
	void test1(){
//		System.out.println(rubbishController.getRegionInfo().toString());
		System.out.println(rubbishController.getLearnPassing().toString());
//		System.out.println(rubbishController.getErrorPassing().toString());
//		System.out.println(rubbishController.getWastePassing().toString());
	}

}
