package com.mcnc.logback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/mcnc/logback/root-context.xml")
public class MyTest {

	private static final Logger LOG  = LoggerFactory.getLogger(MyTest.class);
	
	@Test
	public void doTest() {
		for (int i = 0; i < 100000; i++) {
			LOG.debug("Test debug");
		}
	}
}
