package com.edu.myapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import com.edu.myapp.ui.viewmodel.SignInViewModel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.edu.myapp.R
import com.edu.myapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private val viewModel: SignInViewModel by viewModels()
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}
