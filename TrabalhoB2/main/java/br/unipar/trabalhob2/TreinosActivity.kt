package br.unipar.trabalhob2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class TreinosActivity : AppCompatActivity() {
    private val treinos = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.treinos)

        val registerButton: Button = findViewById(R.id.btn_add_treino)
        val treinoInput: EditText = findViewById(R.id.input_treino)
        val treinosList: TextView = findViewById(R.id.text_treinos)
        registerButton.setOnClickListener {
            val treino = treinoInput.text.toString()
            if (treino.isNotEmpty()) {
                treinos.add(treino)
                treinoInput.text.clear()
                treinosList.text = treinos.joinToString("\n")
            }
        }

        val backButton: Button = findViewById(R.id.btn_back)
        backButton.setOnClickListener {
            finish()

        }
    }
}