package com.example.votingapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CandidatesAdapter(private val candidates: ArrayList<Candidate>)
    : RecyclerView.Adapter<CandidatesViewHolder>() {

    var onCandidateClick : ((Candidate) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandidatesViewHolder {
        return CandidatesViewHolder(LayoutInflater.from(parent.context).inflate
            (R.layout.candidates_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return candidates.size
    }

    override fun onBindViewHolder(holder: CandidatesViewHolder, position: Int) {
        val candidate = candidates[position]
        holder.profile.setImageResource(candidate.image)
        holder.candidateName.text = candidate.name

        holder.itemView.setOnClickListener{
            onCandidateClick?.invoke(candidate)
        }

    }

}