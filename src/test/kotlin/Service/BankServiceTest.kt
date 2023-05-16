package Service

import datasource.BankDataSource

import io.mockk.mockk
import io.mockk.verify

import org.junit.jupiter.api.Test



//Checking whether a service calls its data source as it should
//The idea is when we call a service it should return its data source

internal class BankServiceTest{
     private val dataSource : BankDataSource = mockk(relaxed = true)
    private val bankService =   BankService(dataSource)


    @Test
    fun `should call its data source to retrieve banks `() {
        //given
      //every { dataSource.retrieveBanks() } returns emptyList()
        
        
        //when


       bankService.getBanks()
        
        //then
        verify(exactly = 1) {dataSource.retrieveBanks()}  // The service should call the data source exactly once after calling the data source
        
        
        }
    
}