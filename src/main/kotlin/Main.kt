import application.AccountApplication
import application.EmployeeApplication
import domains.Account
import modules.accountModule
import modules.employeeModule
import org.koin.core.context.startKoin

fun main() {

    startKoin{
        modules(accountModule, employeeModule)
    }

     println(".".repeat(1000))

    var account: Account = AccountApplication().save()
    println("save  : $account")

    account = AccountApplication().update()
    println("update: $account")

    var flag = AccountApplication().delete()
    println("delete: $flag")

    val accounts = AccountApplication().search()
    println("search: $accounts")

    println(".".repeat(1000))

    var employee = EmployeeApplication().save()
    println("save  : $employee")

    employee = EmployeeApplication().update()
    println("update: $employee")

    flag = EmployeeApplication().delete()
    println("delete: $flag")

    val employees = EmployeeApplication().search()
    println("search: $employees")

    println(".".repeat(1000))
 }

