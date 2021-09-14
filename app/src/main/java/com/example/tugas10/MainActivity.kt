package com.example.tugas10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.compose.material.icons.Icons

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var gridView: GridView

        val menusName = arrayOf(
            "Profile",
            "Search Job",
            "Notification",
            "Messages",
            "Rate Card",
            "Review")

        val menusIcon = intArrayOf(
            /*
            Icons.Rounded,
            Icons.Rounded,
            Icons.Rounded,
            Icons.Rounded,
            Icons.Rounded,
            Icons.Rounded,
             */
        )


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Home"

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
