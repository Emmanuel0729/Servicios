package utez.edu.mx.servicios.ServiceProvider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_service_provider_screen.*
import kotlinx.android.synthetic.main.activity_login_user_screen.*
import utez.edu.mx.servicios.R
import utez.edu.mx.servicios.User.LoginUserScreen

class LoginServiceProviderScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_service_provider_screen)

        btnSigninUser.setOnClickListener{
            val intent = Intent(this@LoginServiceProviderScreen, LoginUserScreen::class.java)
            startActivity(intent)
        }
    }
}