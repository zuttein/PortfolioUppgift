package com.example.portfoliouppgift

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PersonalListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_lista)
        val githubPersonallistaBtn: Button = findViewById(R.id.btn_personallista)

        githubPersonallistaBtn.setOnClickListener {
            val githubIntent = Intent(
                Intent.ACTION_VIEW,
                //Goes to github adress
                Uri.parse(getString(R.string.github_adress_personallista))
            )
            startActivity(githubIntent)
        }
    }
}