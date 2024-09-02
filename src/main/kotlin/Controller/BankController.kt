package Controller
import Service.BankService
import model.Bank
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/banks")
class BankController(private val service : BankService) {

    @GetMapping
    fun getBanks() : Collection<Bank> = service.getBanks()


@GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String) = "you want data about the account number"
}
