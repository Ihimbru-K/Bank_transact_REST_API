package model

import org.apache.tomcat.util.descriptor.web.ContextTransaction


//This is a data transfer object (that is transferred over the network)


/**
*Data classes contain data,hashcode and toString implementations all in one
* Class properties are fields together with their getters and setters
*/
data class Bank(val accountNumber: String, val trust: Double, val transactionFee: Int) {
}
