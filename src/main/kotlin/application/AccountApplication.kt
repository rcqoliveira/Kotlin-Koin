package application

import domains.Account
import interfaces.AccountService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class AccountApplication : KoinComponent {

     private val accountService: AccountService by inject()

     fun save() : Account = accountService.save()
     fun delete() : Boolean = accountService.delete()
     fun update() : Account = accountService.update()
     fun search() : List<Account> = accountService.search()
 }