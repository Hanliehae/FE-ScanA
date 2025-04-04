package com.example.handscanattendance.data.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.handscanattendance.databinding.ActivityLoginBinding
import com.example.handscanattendance.viewmodel.AuthViewModel
import com.example.handscanattendance.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val authViewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            authViewModel.login(email, password).observe(this) { isSuccess ->
                if (isSuccess) {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                } else {
                    binding.tvError.text = "Login gagal, periksa kembali kredensial Anda"
                }
            }
        }
    }
}
