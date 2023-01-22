package com.example.votingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import com.example.votingapp.databinding.ActivityCategoriesBinding
import com.example.votingapp.databinding.ActivityMainBinding


class CategoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)



//        listview
        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

//        adding items in listview
        list.add(Model("Chairperson", "Meet your candidates for the presidential docket", R.drawable.user))
        list.add(Model("Vice Chairperson", "Meet your candidates for the vice-presidential docket", R.drawable.user))
        list.add(Model("Secretary", "Meet your candidates for the secretarial docket", R.drawable.secretary))
        list.add(Model("Finance Representative", "Meet your candidates for the financial docket", R.drawable.finance))
        list.add(Model("Public Relations", "Meet your candidates for the public relations docket", R.drawable.pr))
        list.add(Model("Male Academic Representative", "Meet your male candidates for the academic docket", R.drawable.academic))
        list.add(Model("Female Academic Representative", "Meet your female candidates for the academic docket", R.drawable.academic))
        list.add(Model("Male Sports Representative", "Meet your male candidates for the sports docket", R.drawable.sports))
        list.add(Model("Female Sports Representative", "Meet your female candidates for the sports docket", R.drawable.sports))

//        adapter
        listview.adapter = CategoriesListAdapter(this, R.layout.categories, list)

//        when item on list is clicked
            listview.setOnItemClickListener { parent, view, position, id ->
                val intent = Intent(this,CandidatesActivity::class.java)
                startActivity(intent)
            }
        }
    }

