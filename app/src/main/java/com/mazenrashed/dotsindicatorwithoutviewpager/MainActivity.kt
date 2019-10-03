package com.mazenrashed.dotsindicatorwithoutviewpager

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentPage = 0
    private val pagesCount = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next_page.setOnClickListener {
            if (pagesCount > currentPage.plus(1))
                dots_indicator.setDotSelection(++currentPage)
        }

        previous_page.setOnClickListener {
            if (currentPage.minus(1) >= 0)
                dots_indicator.setDotSelection(--currentPage)
        }

        dots_indicator.onSelectListener = {
            Toast.makeText(this, "page $it selected", Toast.LENGTH_SHORT).show()
        }
    }
}
