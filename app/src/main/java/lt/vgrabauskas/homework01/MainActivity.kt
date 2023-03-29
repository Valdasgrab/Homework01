package lt.vgrabauskas.homework01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "check_this"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.okButton)
        button.setOnClickListener{
            var nameEditText: TextView = findViewById(R.id.nameEditText)
            var nameLength: Int = nameEditText.text.length
            Log.i(TAG, "onCreate: $nameLength")
            var numberOfLetters: TextView = findViewById(R.id.numberOfLettersTextView)
            numberOfLetters.setText("The name contains $nameLength symbols")
        }



    }


}