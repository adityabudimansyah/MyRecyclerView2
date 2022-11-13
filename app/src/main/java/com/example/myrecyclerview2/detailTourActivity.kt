package com.example.myrecyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detailTourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tour)

        supportActionBar?.setTitle("Detail")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tour = intent.getParcelableExtra<tour>(MainActivity.INTENT_PARCELABLE)

        val name = findViewById<TextView>(R.id.tv_item_name)
        val description = findViewById<TextView>(R.id.tv_item_description)
        val photo = findViewById<ImageView>(R.id.img_item_photo)

        name.text = tour?.name
        description.text = tour?.description
        photo.setImageResource(tour?.photo!!)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}