package com.example.portfoliouppgift
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NotePadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_pad)
        val githubNotepadBtn: Button = findViewById(R.id.btn_notepad)

        githubNotepadBtn.setOnClickListener {
            val githubIntent = Intent(
                Intent.ACTION_VIEW,
                //Goes to github adress
                Uri.parse(getString(R.string.github_adress_notepad))
            )
            startActivity(githubIntent)
        }
    }
}