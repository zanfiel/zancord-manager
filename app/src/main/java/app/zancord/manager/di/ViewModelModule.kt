package app.zancord.manager.di

import app.zancord.manager.ui.viewmodel.home.HomeViewModel
import app.zancord.manager.ui.viewmodel.installer.InstallerViewModel
import app.zancord.manager.ui.viewmodel.installer.LogViewerViewModel
import app.zancord.manager.ui.viewmodel.libraries.LibrariesViewModel
import app.zancord.manager.ui.viewmodel.settings.AdvancedSettingsViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val viewModelModule = module {
    factoryOf(::InstallerViewModel)
    factoryOf(::AdvancedSettingsViewModel)
    factoryOf(::HomeViewModel)
    factoryOf(::LogViewerViewModel)
    factoryOf(::LibrariesViewModel)
}