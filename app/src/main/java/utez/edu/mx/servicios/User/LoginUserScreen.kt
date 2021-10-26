package utez.edu.mx.servicios.User

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_user_screen.*
import kotlinx.android.synthetic.main.activity_main.*
import utez.edu.mx.servicios.R
import utez.edu.mx.servicios.ServiceProvider.LoginServiceProviderScreen
import utez.edu.mx.servicios.User.UserMenu.MenuUserActivity
import kotlin.system.exitProcess

class LoginUserScreen : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {

        when(p0!!.id){
            R.id.btnLoginUser ->{
                val intent = Intent(this@LoginUserScreen, MenuUserActivity::class.java)

                intent.putExtra("usuario",edtEmail.text.toString())
                intent.putExtra("password",edtPassword.text.toString())

                if (edtEmail.text.toString() == "" || edtPassword.text.toString() == ""){
                    Toast.makeText(this,"¡Debes llenar los campos!", Toast.LENGTH_SHORT).show()
                }else{
                    startActivity(intent)
                }
            }
            else -> {}
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user_screen)

        btnLoginUser.setOnClickListener(this)

        btnSigninServiceProvider.setOnClickListener{
            val intent = Intent(this@LoginUserScreen, LoginServiceProviderScreen::class.java)
            startActivity(intent)
        }

        btnSignupUser.setOnClickListener {
            val intent = Intent(this@LoginUserScreen, SignupUserScreen::class.java)
            startActivity(intent)
        }
    }
}