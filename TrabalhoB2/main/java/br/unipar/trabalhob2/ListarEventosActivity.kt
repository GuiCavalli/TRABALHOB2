package br.unipar.trabalhob2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ListarEventosActivity : AppCompatActivity() {

    private val eventos = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listar_eventos)


        val eventoInput: EditText = findViewById(R.id.input_evento)


        val cadastrarButton: Button = findViewById(R.id.btn_add_evento)
        cadastrarButton.setOnClickListener {
            val intent = Intent(this, CadastrarEventosActivity::class.java)
            startActivity(intent)
        }

        val backButton: Button = findViewById(R.id.btn_back)
        backButton.setOnClickListener {
            finish()
        }
    }
}
