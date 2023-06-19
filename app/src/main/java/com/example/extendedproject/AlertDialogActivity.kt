package com.example.extendedproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogActivity : AppCompatActivity() {
    lateinit var btnon:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        btnon = findViewById(R.id.button20)
        btnon.setOnClickListener {
            var box=AlertDialog.Builder(this,)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED",DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert=box.create()
            alert.setTitle("Pavin")
            alert.show()

        }
    }
}