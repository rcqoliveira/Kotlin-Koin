package modules

import interfaces.EmployeeService
import org.koin.dsl.module
import services.EmployeeServiceImpl

var employeeModule = module {
    single<EmployeeService> { EmployeeServiceImpl() }
}