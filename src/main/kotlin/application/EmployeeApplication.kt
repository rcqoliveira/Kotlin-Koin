package application

import domains.Employee
import interfaces.EmployeeService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class EmployeeApplication : KoinComponent{
    private val employeeService : EmployeeService by inject()

    fun save() : Employee = employeeService.save()
    fun delete() : Boolean = employeeService.delete()
    fun update() : Employee = employeeService.update()
    fun search() : List<Employee> = employeeService.search()
}