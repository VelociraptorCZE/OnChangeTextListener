package com.company.onchangetextlistener_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Main : AppCompatActivity() {

    private var changed = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = findViewById<EditText>(R.id.inputSample)
        OnChangeTextListener.Add(input, ::onChangeFunction)
    }

    private fun onChangeFunction(){
        changed++
        findViewById<TextView>(R.id.outputSample).text = "Text were changed $changed times"
    }
}
