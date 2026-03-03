package app.zancord.manager.di

import app.zancord.manager.domain.manager.DownloadManager
import app.zancord.manager.domain.manager.InstallManager
import app.zancord.manager.domain.manager.PreferenceManager
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val managerModule = module {
    singleOf(::DownloadManager)
    singleOf(::PreferenceManager)
    singleOf(::InstallManager)
}