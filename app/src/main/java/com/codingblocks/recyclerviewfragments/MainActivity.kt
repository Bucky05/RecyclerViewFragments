package com.codingblocks.recyclerviewfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun menu(view: View) {
        val manager:FragmentManager = supportFragmentManager
        val transaction:FragmentTransaction = manager.beginTransaction()
        val learn = learn()
        transaction.replace(R.id.fragment1,learn)
        transaction.commit()
    }
}