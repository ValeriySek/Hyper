package com.android.hyper.feature.login_by_sms

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ViewModelScoped

@ViewModelScoped
class LoginBySmsViewModel : ViewModel() {


    val liveData = MutableLiveData<String>("njn ntls")
}