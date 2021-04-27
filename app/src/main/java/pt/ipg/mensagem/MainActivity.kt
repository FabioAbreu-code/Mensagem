package pt.ipg.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*


class MainActivity : AppCompatActivity() {
    companion object{
        val INFO_EXTRA_MENSAGEM = "MENSAGEM"
        val INFO_DATA_HORA = "DATA_HORA"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
        val mensagem = editTextMensagem.text.toString()

        val dataAtual = Calendar.getInstance().get(Calendar.DATE).toString()+ "/" +(Calendar.getInstance().get(Calendar.MONTH).toInt()+1)+ "/"+Calendar.getInstance().get(Calendar.YEAR).toInt()+ " " +Calendar.getInstance().get(Calendar.HOUR).toInt()+ ":" +Calendar.getInstance().get(Calendar.MINUTE).toInt()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }

        val  intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra(INFO_EXTRA_MENSAGEM, mensagem)
        intent.putExtra(INFO_DATA_HORA, dataAtual)

        startActivity(intent)

    }
}