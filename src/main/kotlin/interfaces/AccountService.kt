package interfaces

import domains.Account

interface AccountService {

    fun save() : Account

    fun delete() : Boolean

    fun update() : Account

    fun search(): List<Account>
}