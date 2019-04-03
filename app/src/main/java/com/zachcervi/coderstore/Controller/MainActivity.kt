package com.zachcervi.coderstore.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.zachcervi.coderstore.Adapters.CategoryAdapter
import com.zachcervi.coderstore.Model.Category
import com.zachcervi.coderstore.R
import com.zachcervi.coderstore.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       adapter = CategoryAdapter(this, DataService.categories)

        categoriesListView.adapter = adapter
    }
}
