package com.example.mynotes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mynotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newFragment = AddNoteFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.framePlaceForNote,newFragment)
            .commit()

        binding.floatingActionButton.setOnClickListener {
           // val newFragment = AddNoteFragment()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.framePlaceForNote,newFragment)
                .commit()



        }
    }
}