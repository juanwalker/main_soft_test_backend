package com.ecomoda;

import com.ecomoda.model.ArticleType;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class EcomodaApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getAllIdTypes() throws Exception {
		this.mockMvc.perform(get("/idTypes")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void getAllArticlesTest() throws Exception
	{
		this.mockMvc.perform(get("/cart")).andDo(print()).andExpect(status().isOk());
	}


}
