package com.zachcervi.coderstore.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zachcervi.coderstore.R
import com.zachcervi.coderstore.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
