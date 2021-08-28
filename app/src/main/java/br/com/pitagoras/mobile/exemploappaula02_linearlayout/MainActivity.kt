package br.com.pitagoras.mobile.exemploappaula02_linearlayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


//TODO: Impedir que envie um nome vazio
//TODO: Criar um botão para limpar o campo de nome completo e o textview que exibe o resultado
//TODO: Inserir um imageView no cabeçalho
//TODO: Extra: colocar um botao ao lado do outro. Dica: Utilize outro viewGroup para organizar os botoes
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarComponentes()

    }

    private fun iniciarComponentes() {
        val tvNomeCompleto = findViewById<TextView>(R.id.tvMainNome)
        val btEnviar = findViewById<Button>(R.id.btMainEnviar)
        val etNomeCompleto = findViewById<EditText>(R.id.etMainNomeCompleto)
        btEnviar.setOnClickListener {
            val nomeCompleto = "O nome informado foi: ${etNomeCompleto.text}"
            tvNomeCompleto.text = nomeCompleto
        }
        // Como exibir uma mensagem temporária na tela. :)
        Toast.makeText(this, "Exemplo", Toast.LENGTH_LONG).show()
    }
}