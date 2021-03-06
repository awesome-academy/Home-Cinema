package com.sun.homecinema.di

import com.sun.homecinema.ui.detail.DetailViewModel
import com.sun.homecinema.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get(), get()) }
}
