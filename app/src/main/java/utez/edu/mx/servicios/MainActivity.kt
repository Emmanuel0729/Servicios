package utez.edu.mx.servicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import utez.edu.mx.servicios.User.LoginUserScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initApp()
    }

    fun initApp(){
        Handler().postDelayed({
            startActivity(Intent(this@MainActivity, LoginUserScreen::class.java))
        },3000)

    }

}