package com.example.votingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CandidatesActivity : AppCompatActivity(){
    lateinit var recyclerView: RecyclerView
    lateinit var candidatesAdapter: CandidatesAdapter
    lateinit var candidates: ArrayList<Candidate>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candidates)

        recyclerView = findViewById(R.id.rv_candidates_list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        candidates = ArrayList()

        candidates.add(Candidate(R.drawable.user, "Michelle Were"))
        candidates.add(Candidate(R.drawable.user, "Favour Ayiela"))
        candidates.add(Candidate(R.drawable.user, "Hellen Ndathi"))
        candidates.add(Candidate(R.drawable.user, "Jean Wasike"))

        candidatesAdapter = CandidatesAdapter(candidates)
        recyclerView.adapter = candidatesAdapter

        candidatesAdapter.onCandidateClick = {
            val intent = Intent(this, ManifestoActivity::class.java)
            intent.putExtra("candidate", it)
            startActivity(intent)
        }
    }
}