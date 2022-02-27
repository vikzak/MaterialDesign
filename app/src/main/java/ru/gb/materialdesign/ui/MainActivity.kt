package ru.gb.materialdesign.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gb.materialdesign.R
import ru.gb.materialdesign.ui.main.MainFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}