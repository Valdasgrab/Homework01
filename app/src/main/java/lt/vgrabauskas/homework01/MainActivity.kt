package lt.vgrabauskas.homework01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "check_this"
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.okButton)
        button.setOnClickListener{
            nameAndFuel()
        }
    }
    @SuppressLint("SetTextI18n")
    fun nameAndFuel() {
        val nameEditText: TextView = findViewById(R.id.nameEditText)
        val nameLength: Int = nameEditText.text.length
        Log.i(TAG, "onCreate: $nameLength")
        val numberOfLetters: TextView = findViewById(R.id.numberOfLettersTextView)
        numberOfLetters.text = "The name contains $nameLength symbols"

        val fuelPrice : TextView = findViewById(R.id.fuelPriceEditText)
        val fuelFloat: Float = fuelPrice.text.toString().toFloat()
        val fuelPriceChange: TextView = findViewById(R.id.fuelPriceTextView)
        fuelPriceChange.text = "Fuel price is $fuelFloat Eur"

        val sumtext: TextView = findViewById(R.id.sumTextView)
        val sum: Float = nameLength + fuelFloat
        sumtext.text = "Sum of symbols and fuel price is $sum"

        val isSumPositive = sum > 0
        val sumPositive: TextView = findViewById(R.id.isSumPositiveTextView)
        sumPositive.text = "Is sum positive? $isSumPositive"

        val firstLetter = nameEditText.text[0]
        val firstLetterView: TextView = findViewById(R.id.firstLetterTextView)
        firstLetterView.text = "First letter of the name is '$firstLetter' "

        val subtraction: Float = nameLength - fuelFloat
        val subtractionView: TextView = findViewById(R.id.subtractTextView)
        subtractionView.text = "Result of subtraction $subtraction"

        val isSumStillPositive = subtraction > 0
        val sumStillPositiveView: TextView = findViewById(R.id.isStillPositiveTextView)
        sumStillPositiveView.text = "Is sum still positive? $isSumStillPositive"

        val charCode = firstLetter.code
        val letterId: TextView = findViewById(R.id.letterIdPositiveTextView)
        letterId.text = "The id of '$firstLetter' letter is $charCode "
    }
}