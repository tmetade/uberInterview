package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.models.Page
import com.example.myapplication.views.ScreenViewModel

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding

    private val screenViewModel: ScreenViewModel = ScreenViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        screenViewModel.getPage("29b31adb-e34e-4f03-9876-dece9ca0eb00", callback = ::displayPage)
    }

    private fun displayPage(page: Page?) {
        if (page != null){
            binding?.pageTitle?.text = page.title
            binding?.pageSubtitle?.text = page.subtitle
            binding?.pageButton?.text = page.buttonText
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}