package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class SecondActivity : AppCompatActivity() {
    lateinit var images: CircleImageView
    lateinit var Name: TextView
    lateinit var Number: TextView
    lateinit var location: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        images = findViewById(R.id.Image)
        Name = findViewById(R.id.Name)
        Number = findViewById(R.id.Number)
        location = findViewById(R.id.location)

        getData()


    }

    private fun getData() {
        val name = intent.getStringExtra("name")
        Name.text = "Name: "+name
        val imageUrl = intent.getStringExtra("profile")
        Glide.with(this).load(imageUrl).into(images)
        val number = intent.getStringExtra("number")
        Number.text = "Number: "+number
        val Location = intent.getStringExtra("location")
        location.text = "Location: "+Location

    }
}