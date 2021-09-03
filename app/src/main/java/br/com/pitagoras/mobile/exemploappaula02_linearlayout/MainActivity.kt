package br.com.pitagoras.mobile.exemploappaula02_linearlayout

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.pitagoras.mobile.exemploappaula02_linearlayout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        iniciarComponentes()
    }

    private fun iniciarComponentes() {
        // TODO - substituir e usar o viewBinding
        val btEnviar = findViewById<Button>(R.id.btMainEnviar)
        val btLimpar = findViewById<Button>(R.id.btMainLimparCampos)

        //TODO Exibir um toast no lugar do texto no TextView
        btEnviar.setOnClickListener {
            exibirMensagem()
        }

        btLimpar.setOnClickListener {
            binding.etMainNomeCompleto.text.clear()
            binding.tvMainNome.text = ""
        }


        // Como exibir uma mensagem temporária na tela. :)
        Toast.makeText(this, "Exemplo", Toast.LENGTH_LONG).show()
    }

    private fun exibirMensagem() {
        var textoDoTextView = getString(R.string.mensagem_erro_nome_nao_preenchido)
        if (!binding.etMainNomeCompleto.text.isNullOrBlank()) {
            textoDoTextView = getString(R.string.mensagem_nome_ok, binding.etMainNomeCompleto.text)
        }
        binding.tvMainNome.text = textoDoTextView
    }


}