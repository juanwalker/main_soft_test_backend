package com.ecomoda;

import com.ecomoda.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
		this.mockMvc.perform(get("/articles")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void testCart() throws Exception
	{
		Cart cart = new Cart();
		Person person = new Person();
		person.setFullname("Pepito Perez");
		person.setIdNumber("123456789");
		person.setIdType("1");
		cart.setPerson(person);
		cart.setItems(new ArrayList<>());
		cart.setAddress("Address");
		ArticleType articleType = new ArticleType("", "Product 1", "100");
		CartItem cartItem = new CartItem("1", articleType, 1);
		cart.getItems().add(cartItem);
		DeliveryDate deliveryDate = new DeliveryDate();
		deliveryDate.setDay("1");
		deliveryDate.setMonth("1");
		deliveryDate.setYear("2023");
		cart.setDeliveryDate(deliveryDate);
		this.mockMvc.perform(post("/cart").content(asJsonString(cart))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isCreated());
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
