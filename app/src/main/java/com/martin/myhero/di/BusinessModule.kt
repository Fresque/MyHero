package com.martin.myhero.di

import com.martin.myhero.data.repositories.CharactersRepository
import com.martin.myhero.data.repositories.EventRepository
import com.martin.myhero.ui.characters.CharactersViewModel
import com.martin.myhero.ui.events.EventsViewmodel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val businessModule = module {

    viewModel { CharactersViewModel(get()) }
    viewModel { EventsViewmodel(get()) }

    single { CharactersRepository(get()) }
    single { EventRepository(get()) }
}