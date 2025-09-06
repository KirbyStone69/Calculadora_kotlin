package upv_dap.sep_dic_25.itiid_76129.piu1.zuniga_zavala.calculadora_kotlin

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //lateinit var x: int
    lateinit var TextView1: TextView
    lateinit var Boton1: Button
    lateinit var EditText1: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        TextView1 = findViewById<TextView>(R.id.nombre)
        Boton1 = findViewById<Button>(R.id.Button1)
        EditText1 = findViewById<EditText>(R.id.edit)

        Boton1.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Bienvenido don "+ EditText1.text.toString(),
                Toast.LENGTH_SHORT
            ).show()
            TextView1.text = EditText1.text.toString()
        }


        }
    }