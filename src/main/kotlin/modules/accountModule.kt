package modules

import interfaces.AccountService
import org.koin.dsl.module
import services.AccountServiceImpl

var accountModule = module {
    single<AccountService> { AccountServiceImpl() }
}