package com.example.fhict;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		classes = { JPAConfig.class },
		loader = AnnotationConfigContextLoader.class)
@Transactional
class UserApplicationTests {

	@Test
	void contextLoads() {
		assert true;
	}

}
