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
    //lateinit var Location: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        images = findViewById(R.id.Image)
        Name = findViewById(R.id.Name)
        Number = findViewById(R.id.Number)
        //Location = findViewById(R.id.Location)

        getData()


    }

    private fun getData() {
        Name.text = intent.getStringExtra("name")

        val imageUrl = intent.getStringExtra("profile")
        Glide.with(this).load(imageUrl).into(images)

        Number.text = intent.getStringExtra("number")

        //Location.text = intent.getStringExtra("location")

    }
}