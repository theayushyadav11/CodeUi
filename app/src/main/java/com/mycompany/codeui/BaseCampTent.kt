package com.mycompany.codeui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


lateinit var hourlyll:LinearLayout
lateinit var dailyll:LinearLayout
lateinit var monthlyll:LinearLayout
lateinit var mainImg:ImageView
lateinit var  ImageView2:ImageView
lateinit var Title:TextView
lateinit var hrRate:TextView
lateinit var daRate:TextView
lateinit var moRate:TextView
lateinit var hourly:TextView
lateinit var monthly:TextView
lateinit var daily:TextView

class BaseCampTent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_camp_tent)
        hourlyll=findViewById(R.id.hourlyll)
        dailyll=findViewById(R.id.dailyll)
        monthlyll=findViewById(R.id.monthlyll)
        mainImg=findViewById(R.id.mainImg)
        Title=findViewById(R.id.title)
        hrRate=findViewById(R.id.hrRate)
        daRate=findViewById(R.id.daRate)
        moRate=findViewById(R.id.moRate)
        hourly=findViewById(R.id.hourly)
        daily=findViewById(R.id.daily)
        monthly=findViewById(R.id.monthly)
        ImageView2=findViewById(R.id.imageView2)


        var i=intent
        var select=i.getIntExtra("select",1)
        if(select==1)
        {
         mainImg.setImageResource(R.drawable.pixel)
            Title.setText("Google Pixel Tablet")
            hrRate.setText(" ₹500")
            daRate.setText(" ₹2500")
            moRate.setText(" ₹10000")
        }
        if(select==2)
        {
            mainImg.setImageResource(R.drawable.tent)
            ImageView2.setImageResource(R.drawable.heartpurple)
            Title.setText("Base Camp Tent")
            hrRate.setText(" ₹250 ")
            daRate.setText(" ₹1250")
            moRate.setText(" ₹5000")

        }
        if(select==3)
        {
            mainImg.setImageResource(R.drawable.pot)
            Title.setText("Stainless Steel Pot")
            hrRate.setText(" ₹25.00")
            daRate.setText(" ₹1250")
            moRate.setText(" ₹500")
        }
        if(select==4)
        {
            mainImg.setImageResource(R.drawable.spraymachine)
            Title.setText("Spray Machine")
            hrRate.setText(" ₹50")
            daRate.setText(" ₹250")
            moRate.setText(" ₹1000")

        }
    }
    fun cli1(view : View)
    {

     hourlyll.setBackgroundColor(Color.parseColor("#151617"))
        dailyll.setBackgroundColor(Color.parseColor("#f1eef4"))
        monthlyll.setBackgroundColor(Color.parseColor("#f1eef4"))
        hourly.setTextColor(Color.WHITE)
        hrRate.setTextColor(Color.WHITE)
         daily.setTextColor(Color.BLACK)
        daRate.setTextColor(Color.GRAY)
        monthly.setTextColor(Color.BLACK)
        moRate.setTextColor(Color.GRAY)
    }
    fun cli2(view : View)
    {

        dailyll.setBackgroundColor(Color.parseColor("#151617"))
        hourlyll.setBackgroundColor(Color.parseColor("#f1eef4"))
        monthlyll.setBackgroundColor(Color.parseColor("#f1eef4"))
        daily.setTextColor(Color.WHITE)
        daRate.setTextColor(Color.WHITE)
        hourly.setTextColor(Color.BLACK)
        hrRate.setTextColor(Color.GRAY)
        monthly.setTextColor(Color.BLACK)
        moRate.setTextColor(Color.GRAY)



    }
    fun cli3(view : View)
    {

        monthlyll.setBackgroundColor(Color.parseColor("#151617"))
        dailyll.setBackgroundColor(Color.parseColor("#f1eef4"))
        hourlyll.setBackgroundColor(Color.parseColor("#f1eef4"))
        monthly.setTextColor(Color.WHITE)
        moRate.setTextColor(Color.WHITE)
        daily.setTextColor(Color.BLACK)
        daRate.setTextColor(Color.GRAY)
        hourly.setTextColor(Color.BLACK)
        hrRate.setTextColor(Color.GRAY)

    }
    fun back(view:View)
    {
        onBackPressed();
    }
}