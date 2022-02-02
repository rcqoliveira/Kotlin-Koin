import domains.Employee
import interfaces.EmployeeService
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import kotlin.test.assertEquals

class EmployeeServiceTest {

    @Test
    fun delete_whenSendOneIdValid_returnTrue() {

        //Given
        val mockEmployee: EmployeeService = mock()

        //When
        whenever(mockEmployee.delete()).thenReturn(true)

        //Then
        assertEquals(true, mockEmployee.delete())

    }

    @Test
    fun search_whenSendOneIdValid_returnTrue() {

        //Given
        val mockEmployee: EmployeeService = mock()
        val listEmployee = listOf(
            Employee(id = 3, firstName = "Elon", lastName = "Musk"),
            Employee(id = 1, firstName = "Bill", lastName = "Gates"),
            Employee(id = 2, firstName = "Steve", lastName = "Jobs")
        )
        //When
        whenever(mockEmployee.search()).thenReturn(listEmployee)

        //Then
        assertEquals(3, mockEmployee.search().count() )
    }

    @Test
    fun save_whenSendObjectValid_returnObjectWithId() {

        //Given
        val mockEmployee: EmployeeService = mock()
        val employee = Employee(id = 1, firstName = "Bill", lastName = "Gates")

        //When
        whenever(mockEmployee.save()).thenReturn(employee)

        //Then
        assertEquals(employee.id, mockEmployee.save().id)
        assertEquals(employee.lastName, mockEmployee.save().lastName)
        assertEquals(employee.firstName, mockEmployee.save().firstName)
    }

    @Test
    fun update_whenSendObjectValid_returnObjectWithId() {

        //Given
        val mockEmployee: EmployeeService = mock()
        val employee = Employee(id = 2, firstName = "Steve", lastName = "Jobs")

        //When
        whenever(mockEmployee.update()).thenReturn(employee)

        //Then
        assertEquals(employee.id, mockEmployee.update().id)

    }
}