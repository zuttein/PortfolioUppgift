package com.example.portfoliouppgift

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RestaurangMenyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurang_meny)
        val githubRestaurangmenyBtn: Button = findViewById(R.id.btn_restaurangmeny)

        githubRestaurangmenyBtn.setOnClickListener {
            val githubIntent = Intent(
                Intent.ACTION_VIEW,
                //Goes to github adress
                Uri.parse(getString(R.string.github_adress_restaurangmeny))
            )
            startActivity(githubIntent)
        }
    }
}