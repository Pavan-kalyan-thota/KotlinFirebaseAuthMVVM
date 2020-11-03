package com.pavan.firebaseauthmvvm.ui.home

import android.view.View
import androidx.lifecycle.ViewModel
import com.pavan.firebaseauthmvvm.data.repositories.UserRepository
import com.pavan.firebaseauthmvvm.utils.startLoginActivity

class HomeViewModel(
    private val repository: UserRepository
) : ViewModel() {

    val user by lazy {
        repository.currentUser()
    }

    fun logout(view: View){
        repository.logout()
        view.context.startLoginActivity()
    }
}