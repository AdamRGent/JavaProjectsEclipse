package com.example.demo.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.entity.Duck;

// boots the context
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc // creates the MockMVC object
@ActiveProfiles("test") // sets current profile to 'test'
@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = { "classpath:duck-schema.sql",
		"classpath:duck-data.sql" })

public class DuckControllerIntegrationTest{

	

		@Autowired // tells Spring to insert this object into the class
		private MockMvc mvc; // object for running fake requests

		@Autowired
		private ObjectMapper mapper; // the object Spring uses to convert JSON <-> Java
	
		
		@Test
		public void testCreate() throws Exception {
			// URL body method headers
			Duck testDuck = new Duck(4, "Thor", "lake", "male");
			String testDuckAsJSON = this.mapper.writeValueAsString(testDuck);
			RequestBuilder req = post("/duck/create").content(testDuckAsJSON).contentType(MediaType.APPLICATION_JSON);

			Duck testSavedDuck = new Duck(3, 4, "Thor", "lake", "male");
			String testSavedDuckAsJSON = this.mapper.writeValueAsString(testSavedDuck);
			// this will check the status code of my response
			ResultMatcher checkStatus = status().isCreated();
			// this will check the body of the response
			ResultMatcher checkBody = content().json(testSavedDuckAsJSON);

			// run the request and check both matchers
			this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
		}
		
		@Test
		public void testCreate2() throws Exception {
			// URL body method headers
			Duck testDuck = new Duck(20, "Daffy", "Toon World", "Male");
			String testDuckAsJSON = this.mapper.writeValueAsString(testDuck);
			RequestBuilder req = post("/duck/create").content(testDuckAsJSON).contentType(MediaType.APPLICATION_JSON);

			Duck testSavedDuck = new Duck(3, 20, "Daffy", "Toon World", "Male");
			String testSavedDuckAsJSON = this.mapper.writeValueAsString(testSavedDuck);
			// this will check the status code of my response
			ResultMatcher checkStatus = status().isCreated();
			// this will check the body of the response
			ResultMatcher checkBody = content().json(testSavedDuckAsJSON);

			// run the request and check both matchers
			this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
		}
		
		@Test
		public void testReadById() throws Exception {
			RequestBuilder req = get("/duck/readById/1");

			ResultMatcher checkStatus = status().isOk();

			Duck savedDuck = new Duck(1, 15, "Duck Dodgers", "space", "male");
			String savedDuckAsJSON = this.mapper.writeValueAsString(savedDuck);

			ResultMatcher checkBody = content().json(savedDuckAsJSON);

			this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
		}

		@Test
		public void testReadAll() throws Exception {
			Duck entry = new Duck(1, 15, "Duck Dodgers", "space", "male");
			Duck duck1 = new Duck(2, 20, "Ducky", "lake", "male");
			List<Duck> ducks = new ArrayList<>();
			ducks.add(entry);
			ducks.add(duck1);
			String ducksOutputAsJson = this.mapper.writeValueAsString(ducks);
			
			this.mvc.perform(get("/duck/readAll")
					.contentType(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk())
					.andExpect(content().json(ducksOutputAsJson));
		}
		
		
		@Test
	    public void testUpdate() throws Exception {
	        final Duck newDuck = new Duck(20, "adam", "lake", "male");
	        String newDuckAsJSON = this.mapper.writeValueAsString(newDuck);
	        
	                this.mvc.perform(put("/duck/update/3").contentType(MediaType.APPLICATION_JSON)
	                    .content(this.mapper.writeValueAsString(newDuck)))
	                	.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();

	        Duck result = this.mapper.readValue(newDuckAsJSON, Duck.class);
	        assertThat(result).isEqualTo(newDuck);
	    }
		
		
		@Test
		
		public void testDeleteByID() throws Exception {

			this.mvc.perform(delete("/duck/delete/2")
					.contentType (MediaType.APPLICATION_JSON))
					.andExpect (status().isNoContent());
		}
		
}
