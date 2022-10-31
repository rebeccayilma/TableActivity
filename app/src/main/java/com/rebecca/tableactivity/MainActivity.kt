package com.rebecca.tableactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tableView = findViewById<TableLayout>(R.id.tableLayout)

        val codeInput = findViewById<EditText>(R.id.editTextCode)
        val versionInput = findViewById<EditText>(R.id.editTextVersion)
        val addbtn = findViewById<Button>(R.id.button)
        addbtn.setOnClickListener {
            // Create a new table row.
            val tableRow = TableRow(this) // this
            val versionTV = TextView(this)
            val codeTV = TextView(this)
            versionTV.setText(versionInput.text)
            codeTV.setText(codeInput.text)
            // Set new table row layout parameters.
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.setLayoutParams(layoutParams)

            tableRow.addView(versionTV)
            tableRow.addView(codeTV)
            tableView.addView(tableRow)
        }



    }
}