package com.example.demo;

import net.codestory.simplelenium.SeleniumTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests extends SeleniumTest {

	@Value("${local.server.port}")
	private int port;

	@Test
	public void contextLoads() {
		goTo(getDefaultBaseUrl() + "/names");
		assertThat(false).isEqualTo(true);
	}

	@Override
	protected String getDefaultBaseUrl() {
		return "http://localhost:" + port;
	}
}
