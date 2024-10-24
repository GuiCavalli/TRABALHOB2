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

//        val addButton: Button = findViewById(R.id.btn_add_evento)
        val eventoInput: EditText = findViewById(R.id.input_evento)
//        val eventosList: TextView = findViewById(R.id.text_eventos)

//        addButton.setOnClickListener {
//            val evento = eventoInput.text.toString()
//            if (evento.isNotEmpty()) {
//                eventos.add(evento)
//                eventoInput.text.clear()
//                eventosList.text = eventos.joinToString("\n")
//            }
//        }

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
