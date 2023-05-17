package Controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class BankControllerTest {

    @Autowired
    lateinit var mockMvc : MockMvc //Allows making request without http requests
    
    @Test
    fun `should return all banks `() {
        //when
        mockMvc.get("/api/banks")  //make request to api endpoint
            .andDo { print() } // more info about response
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].accountNumber"){
                    value("67745")
                }
            }  //check for all the http codes eg 404 not found or 200 ok
        
        
        
        //then
        
        
        }
    
    @Test
    fun `should return the bank with a given account number `() {
        //given
        val accountNumber = 67745


        
        
        //when
        mockMvc.get("api/banks/$accountNumber")
            .andDo { print() }
            .andExpect { status { isOk() } }
        
        
        
        //then
        
        
        }


}