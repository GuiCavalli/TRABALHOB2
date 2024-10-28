package br.unipar.trabalhob2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CadastrarEventosActivity : AppCompatActivity() {

    private val eventos = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.listar_eventos)
        val addButton: Button = findViewById(R.id.btn_add_evento)

        val eventoInput: EditText = findViewById(R.id.input_evento)


        addButton.setOnClickListener {

            val evento = eventoInput.text.toString()
            if (evento.isNotEmpty()) {
                eventos.add(evento)
                eventoInput.text.clear()
            }
        }


        val backButton: Button = findViewById(R.id.btn_back)
        backButton.setOnClickListener {
            finish()
        }
    }
}
