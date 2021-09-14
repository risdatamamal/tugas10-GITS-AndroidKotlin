package com.example.tugas10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var gridView: GridView

        val menusName = arrayOf(
            "Github",
            "Address",
            "Email",
            "LinkedIn",
            "Instagram",
            "Steam")

        val menusIcon = intArrayOf(
            R.drawable.github,
            R.drawable.geo,
            R.drawable.mail,
            R.drawable.linkedin,
            R.drawable.instagram,
            R.drawable.steam,
        )


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "My Profile"

        gridView = findViewById(R.id.gridView)
        val mainAdapter = MainAdapter(this@MainActivity, menusName, menusIcon)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                applicationContext, "You cLicked " + menusName[+position],
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
