package com.example.healthok.utils

import com.example.healthok.R
import com.example.healthok.data.model.Categories

class DemoData {
    companion object {
        val categories: List<Categories> = listOf(
            Categories(1, R.drawable.medicine, "Medicine"),
            Categories(2, R.drawable.first_aid_kit, "First Aid"),
            Categories(3, R.drawable.vitaminsupplement, "Vitamins and Supplements"),
            Categories(4, R.drawable.skincare, "Skin Care"),
            Categories(5, R.drawable.womenhealth, "Women's Health"),
            Categories(6, R.drawable.sportandfitness, "Sports and Fitness"),
            Categories(7, R.drawable.haircare, "Hair Care"),
            Categories(8, R.drawable.dental, "Dental Care"),
            Categories(9, R.drawable.herbal, "Herbal")
        )
    }
}
