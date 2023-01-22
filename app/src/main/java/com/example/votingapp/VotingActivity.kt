package com.example.votingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.votingapp.databinding.ActivityVotingBinding

class VotingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voting)

        val vote = findViewById<Button>(R.id.vote)
        vote.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Vote Submitted",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent)
        })
    }
}