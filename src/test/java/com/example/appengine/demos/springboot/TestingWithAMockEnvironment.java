package com.example.appengine.demos.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

// import static
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * By default, @SpringBootTest does not start the server.
 * If you have web endpoints that you want to test against this mock environment, you can additionally configure MockMvc as shown in the following example:
 * If you want to focus only on the web layer and not start a complete ApplicationContext, consider using @WebMvcTest instead.
 * @AutoConfigureWebTestClient
 * private WebTestClient webClient;
 * */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestingWithAMockEnvironment {
  @Autowired
  private MockMvc mvc;

  @Test
	public void exampleTest() throws Exception {
    this.mvc.perform(get("/"))
      .andExpect(status().isOk())
      .andExpect(content().string("Hello world!"));
	}


  @Test
  public void contextLoads() {
  }

}
