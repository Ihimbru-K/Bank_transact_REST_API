package Service

import datasource.BankDataSource
import model.Bank
import org.springframework.stereotype.Service


// makes this a bean available at runtime that can be injected with a dependency injection into other objects and classes
@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks() : Collection<Bank> = dataSource.retrieveBanks()


}