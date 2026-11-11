package seg3x02.employeeGql

import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeGqlApplicationTests {

	@Autowired
	private lateinit var mockMvc: MockMvc

	@Test
	fun contextLoads() {
	}

	@Test
	fun graphiqlPageIsAvailable() {
		mockMvc.perform(get("/graphiql").param("path", "/graphql"))
			.andExpect(status().isOk)
			.andExpect(view().name("forward:/graphiql.html"))

		mockMvc.perform(get("/graphiql.html"))
			.andExpect(status().isOk)
			.andExpect(content().contentTypeCompatibleWith("text/html"))
			.andExpect(content().string(containsString("graphiql@2.4.7")))
	}

}
