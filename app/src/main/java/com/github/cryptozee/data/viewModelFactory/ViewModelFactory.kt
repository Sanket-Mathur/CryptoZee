package com.github.cryptozee.data.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.cryptozee.data.repository.Repository
import com.github.cryptozee.data.viewmodel.MainViewModel

class ViewModelFactorys(private val repository: Repository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return MainViewModel(repository) as T
    }
}