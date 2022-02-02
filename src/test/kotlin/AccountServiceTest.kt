import domains.Account
import interfaces.AccountService
import interfaces.EmployeeService
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import kotlin.test.assertEquals

class AccountServiceTest {
    @Test
    fun delete_whenSendOneIdValid_returnTrue() {

        //Given
        val mockAccount: EmployeeService = mock()

        //When
        whenever(mockAccount.delete()).thenReturn(true)

        //Then
        assertEquals(true, mockAccount.delete())

    }

    @Test
    fun search_whenSendOneIdValid_returnTrue() {

        //Given
        val mockAccount: AccountService = mock()
        val listAccount = listOf(
            Account(id = 1, accountNumber = "11111111", accountDigit = 1),
            Account(id = 2, accountNumber = "22222222", accountDigit = 2),
            Account(id = 3, accountNumber = "33333333", accountDigit = 3),
        )
        //When
        whenever(mockAccount.search()).thenReturn(listAccount)

        //Then
        assertEquals(3, mockAccount.search().count() )
    }

    @Test
    fun save_whenSendObjectValid_returnObjectWithId() {

        //Given
        val mockAccount: AccountService = mock()
        val account = Account(id = 1, accountNumber = "11111111", accountDigit = 1)

        //When
        whenever(mockAccount.save()).thenReturn(account)

        //Then
        assertEquals(account.id, mockAccount.save().id)
        assertEquals(account.accountDigit, mockAccount.save().accountDigit)
        assertEquals(account.accountNumber, mockAccount.save().accountNumber)
    }

    @Test
    fun update_whenSendObjectValid_returnObjectWithId() {

        //Given
        val mockAccount: AccountService = mock()
        val account = Account(id = 2, accountNumber = "22222222", accountDigit = 2)

        //When
        whenever(mockAccount.update()).thenReturn(account)

        //Then
        assertEquals(account.id, mockAccount.update().id)

    }
}