package com.example.portfoliouppgift

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BmiKalkylatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_kalkylator)
        val githubBMIBtn: Button = findViewById(R.id.btn_bmi)

        githubBMIBtn.setOnClickListener {
            val githubIntent = Intent(
                Intent.ACTION_VIEW,
                //Goes to github adress
                Uri.parse(getString(R.string.github_adress_bmi))
            )
            startActivity(githubIntent)
        }
    }
}