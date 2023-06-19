package com.example.extendedproject
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class DashboardActivity : AppCompatActivity() {
    lateinit var home:CardView
    lateinit var chat:CardView
    lateinit var profile:CardView
    lateinit var widgets:CardView
    lateinit var settings:CardView
    lateinit var logout:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        home=findViewById(R.id.cardHome1)
        chat=findViewById(R.id.cardHome2)
        profile=findViewById(R.id.cardHome3)
        widgets=findViewById(R.id.cardHome4)
        settings=findViewById(R.id.cardHome5)
        logout=findViewById(R.id.cardHome6)
       //HOME
        home.setOnClickListener {
            Toast.makeText(applicationContext,"welcome home",Toast.LENGTH_LONG).show()
            val intent = Intent(this,ToolBarActivity::class.java)
            startActivity(intent)
        }

        //CHAT
        chat.setOnClickListener {
            Toast.makeText(applicationContext,"welcome to chat",Toast.LENGTH_LONG).show()
            val intent = Intent(this,AlertDialogActivity::class.java)
            startActivity(intent)
        }

        //profile
        profile.setOnClickListener {
            Toast.makeText(applicationContext,"welcome to your profile",Toast.LENGTH_LONG).show()
            val intent = Intent(this,ListviewActivity::class.java)
            startActivity(intent)
        }

        //widgets
        widgets.setOnClickListener {
            Toast.makeText(applicationContext,"welcome to widgets",Toast.LENGTH_LONG).show()
            val intent = Intent(this,Scrollviewactivity::class.java)
            startActivity(intent)
        }
        //settings
        settings.setOnClickListener {
            Toast.makeText(applicationContext,"welcome to fragmentactivity",Toast.LENGTH_LONG).show()
            val fragment = Intent(this,FragmentActivity::class.java)
            startActivity(fragment)
        }


        logout.setOnClickListener {
            Toast.makeText(applicationContext,"logout successful",Toast.LENGTH_LONG).show()
            var box=AlertDialog.Builder(this,)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED",DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Pavin")
            alert.show()

        }

    }
}