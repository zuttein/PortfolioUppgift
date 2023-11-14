package com.example.portfoliouppgift

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GruppUppgiftKalkylatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grupp_uppgift_kalkylator)
        val githubKalkylatorBtn: Button = findViewById(R.id.btn_kalkylator)

        githubKalkylatorBtn.setOnClickListener {
            val githubIntent = Intent(
                Intent.ACTION_VIEW,
                //Goes to github adress
                Uri.parse(getString(R.string.github_adress_kalkylator))
            )
            startActivity(githubIntent)
        }
    }
}