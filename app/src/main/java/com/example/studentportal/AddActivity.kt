package com.example.studentportal

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.content_add.*

const val EXTRA_PORTAL = "EXTRA_PORTAL"

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        initViews()
    }

    private fun initViews() {
        fab.setOnClickListener { onSaveClick() }
    }

    private fun onSaveClick() {
        if (etAddPortal.text.toString().isNotBlank() && etAddPortalUrl.text.toString().isNotBlank()) {
            val portal = Portal(etAddPortal.text.toString(), etAddPortalUrl.text.toString())
            val resultIntent = Intent()
            resultIntent.putExtra(EXTRA_PORTAL, portal)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        } else {
            Toast.makeText(this,"The portal cannot be empty"
                , Toast.LENGTH_SHORT).show()
        }
    }
}