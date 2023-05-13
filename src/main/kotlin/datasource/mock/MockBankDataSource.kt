package datasource.mock

import datasource.BankDataSource
import model.Bank
import org.springframework.stereotype.Repository


/**
 * this MockBankDataSource class inherits the methods of the BankDataSource class
 * The repository annotation marks the mockBankDataSource class as a springboot bean
 * It tells spring to initialise the bean at runtime
 * It also shows it is responsible for storing/retrieving data
 **/

@Repository
class MockBankDataSource : BankDataSource {

    val bank = listOf(Bank("6775", 1.2, 1), Bank("682248238",1.5,0), Bank("693622829", 1.6,22))

    override fun retrieveBanks(): Collection<Bank> = bank

}