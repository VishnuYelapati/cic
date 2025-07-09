package com.edu.myapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.edu.myapp.util.Validator

class SignInViewModel : ViewModel() {

    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _signInStatus = MutableLiveData<String>()
    val signInStatus: LiveData<String> = _signInStatus

    fun onSignInClicked() {
        val emailValue = email.value ?: ""
        val passwordValue = password.value ?: ""

        if (!Validator.isEmailValid(emailValue)) {
            _signInStatus.value = "Invalid email format"
        } else if (!Validator.isPasswordValid(passwordValue)) {
            _signInStatus.value = "Password must be at least 6 characters"
        } else {
            // Simulate a successful sign-in
            _signInStatus.value = "Sign-in successful!"




        }
    }
}