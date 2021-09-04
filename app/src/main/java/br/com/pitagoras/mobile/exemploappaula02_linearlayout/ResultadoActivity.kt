package br.com.pitagoras.mobile.exemploappaula02_linearlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.pitagoras.mobile.exemploappaula02_linearlayout.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        iniciarComponentes()
    }

    private fun iniciarComponentes() {
        binding.tvResultado.text = intent.getStringExtra(TAG)
    }

    companion object {
        val TAG = "MENSAGEM"
    }
}