package mx.edu.utez.deal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.utez.deal.databinding.ActivityDetailServiceBinding

class DetailServiceActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailServiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}