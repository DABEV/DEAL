package mx.edu.utez.deal.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.utez.deal.databinding.ActivityDetailRequestBinding

class DetailRequestActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailRequestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}