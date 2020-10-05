package pl.cyfrogen.budget.ui.splash_screen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import pl.cyfrogen.budget.R

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=3000 // 3 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        Handler().postDelayed({

            startActivity(Intent(this, pl.cyfrogen.budget.ui.signin.SignInActivity::class.java))

            finish()
        }, SPLASH_TIME_OUT)
    }
}
