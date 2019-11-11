package com.example.rubbish;

import com.example.rubbish.controller.RubbishController;
import net.sf.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
class RubbishAdminApplicationTests {
	@Autowired
	RubbishController rubbishController;
	@Test
	void contextLoads() {

	}

	@Test
	void test1(){
		JSONArray jsonArray=rubbishController.getLearnPassing();
		System.out.println("测试断点");
	}

}
