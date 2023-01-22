package com.example.votingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ManifestoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manifesto)

        val candidate = intent.getParcelableExtra<Candidate>("candidate")
        if (candidate !=null){
            val textView : TextView = findViewById(R.id.details)
            val imageView : ImageView = findViewById(R.id.profile2)

            textView.text = candidate.name
            imageView.setImageResource(R.drawable.user)
        }

        val toVotePage = findViewById<Button>(R.id.toVotePage)
        toVotePage.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, VotingActivity::class.java)
            startActivity(intent)
        })
    }
}
