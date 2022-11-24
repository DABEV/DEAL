package mx.edu.utez.deal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.utez.deal.databinding.ActivityConfirmServiceBinding

class ConfirmServiceActivity : AppCompatActivity() {
    lateinit var binding: ActivityConfirmServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityConfirmServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}