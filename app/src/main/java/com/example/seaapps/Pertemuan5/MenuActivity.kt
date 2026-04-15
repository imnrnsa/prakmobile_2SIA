package com.example.seaapps.pertemuan5

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.seaapps.R
import com.example.seaapps.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu1 -> Toast.makeText(this, "Menu 1", Toast.LENGTH_SHORT).show()
            R.id.submenu1 -> Toast.makeText(this, "Sub Menu 1", Toast.LENGTH_SHORT).show()
            R.id.submenu2 -> Toast.makeText(this, "Sub Menu 2", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}