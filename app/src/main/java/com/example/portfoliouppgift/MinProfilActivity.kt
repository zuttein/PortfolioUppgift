package com.example.portfoliouppgift

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MinProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_min_profil)
        val linkedinBtn: ImageButton = findViewById(R.id.linkedin_btn)

        linkedinBtn.setOnClickListener {
            //Goes to linkedin adress
            val linkedinIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.linkedin_adress_profil)))
            startActivity(linkedinIntent)
        }
    }

}