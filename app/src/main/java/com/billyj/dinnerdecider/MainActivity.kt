package com.billyj.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Burger King", "Chinese", "Pizza", "Wendy's" , "McDonalds")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodDescription.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            foodList.add(addFoodTxt.text.toString())

            addFoodTxt.text.clear()
        }

    }
}
