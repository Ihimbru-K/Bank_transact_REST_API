package datasource

import model.Bank

/**
 * The data Source layer allows us to inject different types of data sources into the business logic (service) layer
 * The data can be gotten from a network, database or any other source
 * */


//This interface defines what kind of functionality expected from the data source
interface BankDataSource {



    //this method is to be able to get a collection of bank entities (which is the aim of creating the data source layer)
    fun retrieveBanks() : Collection<Bank>

}