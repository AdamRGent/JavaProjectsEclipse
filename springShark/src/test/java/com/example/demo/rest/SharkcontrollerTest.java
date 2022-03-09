package com.example.demo.rest;

	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.http.MediaType;
	import org.springframework.test.context.ActiveProfiles;
	import org.springframework.test.context.jdbc.Sql;
	import org.springframework.test.web.servlet.MockMvc;
	import org.springframework.test.web.servlet.RequestBuilder;
	import org.springframework.test.web.servlet.ResultMatcher;
	import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
	import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.entity.Shark;
	
	
	
	@SpringBootTest
	@AutoConfigureMockMvc 
	@ActiveProfiles("test") 
	@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = { "classpath:shark-schema.sql",
	"classpath:shark-data.sql" })
	public class SharkcontrollerTest {

			@Autowired // tells Spring to insert this object into the class
			private MockMvc mvc; // object for running fake requests

			@Autowired
			private ObjectMapper mapper; // the object Spring uses to convert JSON <-> Java
		
			
			@Test
			public void testCreate() throws Exception {
				// URL body method headers
				Shark testShark = new Shark(4, "male", "Thor");
				String testSharkAsJSON = this.mapper.writeValueAsString(testShark);
				RequestBuilder req = post("/shark/create").content(testSharkAsJSON).contentType(MediaType.APPLICATION_JSON);

				Shark testSavedShark = new Shark(2, 4, "male", "Thor");
				String testSavedSharkAsJSON = this.mapper.writeValueAsString(testSavedShark);
				// this will check the status code of my response
				ResultMatcher checkStatus = status().isCreated();
				// this will check the body of the response
				ResultMatcher checkBody = content().json(testSavedSharkAsJSON);

				// run the request and check both matchers
				this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
			}
			
			@Test
			public void testCreate2() throws Exception {
				// URL body method headers
				Shark testShark = new Shark(2, 5, "Male", "Loki");
				String testSharkAsJSON = this.mapper.writeValueAsString(testShark);
				RequestBuilder req = post("/shark/create").content(testSharkAsJSON).contentType(MediaType.APPLICATION_JSON);

				Shark testSavedShark = new Shark(2, 5, "Male", "Loki");
				String testSavedSharkAsJSON = this.mapper.writeValueAsString(testSavedShark);
				// this will check the status code of my response
				ResultMatcher checkStatus = status().isCreated();
				// this will check the body of the response
				ResultMatcher checkBody = content().json(testSavedSharkAsJSON);

				// run the request and check both matchers
				this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
			}
			
			@Test
			public void testReadById() throws Exception {
				RequestBuilder req = get("/shark/readById/1");

				ResultMatcher checkStatus = status().isOk();

				Shark savedShark = new Shark(1, 15,"Jaws", "Male");
				String savedSharkAsJSON = this.mapper.writeValueAsString(savedShark);

				ResultMatcher checkBody = content().json(savedSharkAsJSON);

				this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
			}

			@Test
			public void testReadAll() throws Exception {
				RequestBuilder req = get("/shark/readAll");

				ResultMatcher checkStatus = status().isOk();
				this.mvc.perform(req).andExpect(checkStatus);

	}
	}
	
	

