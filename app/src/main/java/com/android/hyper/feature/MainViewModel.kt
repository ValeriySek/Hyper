package com.android.hyper.feature

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ViewModelScoped

@ViewModelScoped
class MainViewModel : ViewModel() {

    val liveData = MutableLiveData<String>("njn ntls")
}