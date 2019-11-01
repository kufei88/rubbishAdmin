package com.example.rubbish;

import com.example.rubbish.controller.RubbishController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RubbishAdminApplicationTests {
	@Autowired
	RubbishController rubbishController;
	@Test
	void contextLoads() {

	}

	@Test
	void test1(){

//		List<Long> list3 = rubbishController.getkitchenWastePassing();
//		List list = rubbishController.getLearnPassing();
		ArrayList list = rubbishController.getUserAll();
		System.out.println("测试断点");
	}

}
