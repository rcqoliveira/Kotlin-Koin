package services

import domains.Employee
import interfaces.EmployeeService

class EmployeeServiceImpl : EmployeeService {
    override fun delete() : Boolean = true

    override fun save(): Employee = Employee(id = 1, firstName = "Bill", lastName = "Gates")

    override fun update(): Employee = Employee(id = 2, firstName = "Steve", lastName = "Jobs")

    override fun search(): List<Employee> = listOf(
        Employee(id = 1, firstName = "Bill", lastName = "Gates"),
        Employee(id = 2, firstName = "Steve", lastName = "Jobs")
    )

}


