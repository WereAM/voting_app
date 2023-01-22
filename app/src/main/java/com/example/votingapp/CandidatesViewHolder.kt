package com.example.votingapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CandidatesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val profile: ImageView = itemView.findViewById(R.id.profile)
    val candidateName: TextView = itemView.findViewById(R.id.candidateName)
}