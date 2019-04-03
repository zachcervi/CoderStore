package com.zachcervi.coderstore.Services

import com.zachcervi.coderstore.Model.Category
import com.zachcervi.coderstore.Model.Product

object DataService {

    val categories = listOf(
       Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("DevSlopes Graphic Beanie", "$18", "hat1"),
        Product("DevSlopes Hat Black", "$20", "hat2"),
        Product("DevSlopes Hat White", "$20", "hat3"),
        Product("DevSlopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("DevSlopes Hoodie Gray", "$28", "hoodie1"),
        Product("DevSlopes Hoodie Red", "$32", "hoodie2"),
        Product("DevSlopes Hoodie ", "$28", "hoodie3"),
        Product("DevSlopes Hoodie Black", "$28", "hoodie4")

    )

    val shirts = listOf(
        Product("DevSlopes Shirt Black", "$18", "shirt1"),
        Product("DevSlopes Badge Light Gray", "$20", "shirt2"),
        Product("DevSlopes Logo Shirt Red ", "$22", "shirt3"),
        Product("DevSlopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$25", "shirt5")

    )
    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{

        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}