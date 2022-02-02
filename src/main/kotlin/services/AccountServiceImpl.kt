package services

import domains.Account
import interfaces.AccountService

class AccountServiceImpl : AccountService {

    override fun delete(): Boolean = true

    override fun save(): Account = Account(id = 1, accountNumber = "111111", accountDigit = 1)

    override fun update(): Account = Account(id = 2, accountNumber = "22222", accountDigit = 2)

    override fun search(): List<Account> = listOf(
        Account(id = 1, accountNumber = "111111", accountDigit = 1),
        Account(id = 2, accountNumber = "22222", accountDigit = 2)
    )
}