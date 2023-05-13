package datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test


internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        //given


        //when

        val banks = mockDataSource.retrieveBanks()



        //then
        assertThat(banks).isNotEmpty()      // Test that there are available banks
        assertThat(banks).size().isGreaterThanOrEqualTo(3)

        }

    @Test
    fun `should  `() {
        //given


        //when
        val banks = mockDataSource.retrieveBanks()


        //then
        assertThat(banks).allMatch { it.accountNumber.isNotEmpty() }  // Test that  all banks have proper account numbers
        assertThat(banks).anyMatch { it.trust != 0.0}
        assertThat(banks).anyMatch { it.transactionFee != 0 }

        }
}