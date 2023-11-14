package com.example.portfoliouppgift


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.portfoliouppgift.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // ViewBinding
    lateinit var binder: ActivityMainBinding

    // List for ListView
    val data = listOf(
        DataKlass("Min Profil ", "En sida med information om mig ",
            R.drawable.profil),
        DataKlass("BMI Kalkylator", "En kalkylator där du kan räkna ut din BMI",
            R.drawable.bmi),
        DataKlass("Restaurang Meny", "En enkel restaurang meny för en restaurang",
            R.drawable.restaurangmeny),
        DataKlass("Grupp Uppgift Kalkylator ", "En kalkylator med olika uträkningar",
            R.drawable.kalkylator),
        DataKlass("Personal Lista", "En personal lista där användaren får mata in information",
            R.drawable.personallista),
        DataKlass("NotePad", "En anteckningsapp som du kan spara anteckningar i",
            R.drawable.notepad)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflates the layout using ViewBinding
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)

        // Retrieves the ListView from the inflated layout
        val listView = binder.lvProjects

        // Creates a custom adapter and sets it to the ListView
        val customAdapter = PersonalAdapter(this, data)
        listView.adapter = customAdapter

        // Handles click events based on item position
        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> {
                    val intent = Intent(this, MinProfilActivity::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent = Intent(this, BmiKalkylatorActivity::class.java)
                    startActivity(intent)
                }
                2 -> {
                    val intent = Intent(this, RestaurangMenyActivity::class.java)
                    startActivity(intent)
                }
                3 -> {
                    val intent = Intent(this, GruppUppgiftKalkylatorActivity::class.java)
                    startActivity(intent)
                }
                4 -> {
                    val intent = Intent(this, PersonalListaActivity::class.java)
                    startActivity(intent)
                }
                5 -> {
                    val intent = Intent(this, NotePadActivity::class.java)
                    startActivity(intent)
                }

            }
        }



    }
}