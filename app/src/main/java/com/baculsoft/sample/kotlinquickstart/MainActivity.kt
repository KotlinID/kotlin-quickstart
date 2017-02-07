package com.baculsoft.sample.kotlinquickstart

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root = findViewById(R.id.cl_main) as CoordinatorLayout

        val toolbar = findViewById(R.id.toolbar_main) as Toolbar
        toolbar.title = title
        setSupportActionBar(toolbar)

        val message = resources.getString(R.string.message)
        val button = findViewById(R.id.btn_main) as Button
        button.setOnClickListener { view -> Snackbar.make(root, message, Snackbar.LENGTH_SHORT).show() }
    }
}