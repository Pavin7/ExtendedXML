package com.example.extendedproject

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable

class ToolBarActivity : AppCompatActivity() {
    lateinit var hme:TextView
    lateinit var aby:TextView
    lateinit var cont:TextView
    lateinit var log:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)
        hme = findViewById(R.id.home)
        aby =findViewById(R.id.about)
        cont =findViewById(R.id.contact)
        log =findViewById(R.id.logout)

        hme.setOnClickListener {
            var gogo = Intent(this,MainActivity::class.java)
            startActivity(gogo)

        }
        aby.setOnClickListener {
            var gogo = Intent(this,MainActivity::class.java)
            startActivity(gogo)

        }

        cont.setOnClickListener {
            var gogo = Intent(this,MainActivity::class.java)
            startActivity(gogo)

        }

        log.setOnClickListener {

            var box= AlertDialog.Builder(this,)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL",
                DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Pavin")
            alert.show()
        }

    }
}