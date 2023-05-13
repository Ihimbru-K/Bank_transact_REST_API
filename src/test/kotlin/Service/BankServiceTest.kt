package Service

import datasource.BankDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test



internal class BankServiceTest{
    private val dataSource : BankDataSource = mockk()
    private val bankService =   BankService(dataSource)


    @Test
    fun `should call its data source to retrieve banks `() {
        //given
        
        
        //when


        val banks = bankService.getBanks()
        
        //then
        verify {dataSource.retrieveBanks()}
        
        
        }
    
}