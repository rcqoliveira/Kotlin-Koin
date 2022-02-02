package interfaces

import domains.Employee

interface EmployeeService {

    fun save() : Employee

    fun delete() : Boolean

    fun update() : Employee

    fun search(): List<Employee>
}