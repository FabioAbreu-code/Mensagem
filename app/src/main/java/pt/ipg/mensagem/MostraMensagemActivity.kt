package pt.ipg.mensagem

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        textViewMensagem.text =mensagem

        val dataAtual = intent.getStringExtra(MainActivity.INFO_DATA_HORA)
        val textViewData = findViewById<TextView>(R.id.textViewData)
        textViewData.text = dataAtual

    }
}