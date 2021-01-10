package com.bitamirshafiee.widgetpracticeskeleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageTextView = findViewById<TextView>(R.id.age_text_view)
        val seekBar = findViewById<SeekBar>(R.id.seek_bar)

        ageTextView.text = String.format(resources.getString(R.string.str_age), 0)

        seekBar.setOnSeekBarChangeListener( object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                ageTextView.text = String.format(resources.getString(R.string.str_age), p1)

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        val spinner = findViewById<Spinner>(R.id.spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.list_of_units,
            android.R.layout.simple_list_item_1 ).also {
                adapter -> spinner.adapter = adapter
        }
        
    }
}