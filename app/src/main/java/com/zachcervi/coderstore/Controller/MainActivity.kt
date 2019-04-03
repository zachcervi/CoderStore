package com.zachcervi.coderstore.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.zachcervi.coderstore.Adapters.CategoryAdapter
import com.zachcervi.coderstore.Adapters.CategoryRecycleAdapter
import com.zachcervi.coderstore.Model.Category
import com.zachcervi.coderstore.R
import com.zachcervi.coderstore.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoriesListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoriesListView.layoutManager = layoutManager
        categoriesListView.setHasFixedSize(true)
        }
    }

