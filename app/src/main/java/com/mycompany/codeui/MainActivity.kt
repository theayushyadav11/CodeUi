package com.mycompany.codeui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun baseCamp(view : View)
    {
        go(2)
    }
    fun pixel(view : View)
    {
        go(1)
    }
    fun steel(view : View)
    {
        go(3)
    }
    fun spray(view : View)
    {
        go(4)
    }
    fun go(n:Int)//this function takes us to next activity
    {
        var i=Intent(this,BaseCampTent::class.java)
        i.putExtra("select",n);
        startActivity(i)
    }
}