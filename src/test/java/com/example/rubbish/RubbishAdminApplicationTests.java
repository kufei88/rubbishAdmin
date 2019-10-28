package com.example.rubbish;

import com.example.rubbish.controller.RubbishController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
		List list = rubbishController.getRegionInfo();
		List list1 = rubbishController.getLearnPassing();
		List list2 = rubbishController.getErrorPassing();
		List list3 = rubbishController.getWastePassing();
		System.out.println("测试断点");
	}

}
