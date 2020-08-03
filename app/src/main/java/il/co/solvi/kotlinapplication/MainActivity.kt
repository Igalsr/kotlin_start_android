package il.co.solvi.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import il.co.solvi.kotlinapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txt.text = "Start"
        binding.btn.setOnClickListener {
            rollDice()
        }

        binding.nextBtn.setOnClickListener {

        }
    }

    private fun rollDice() {

        val randomInt = (1..6).random()
        binding.txt.setText(randomInt.toString())

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImg.setImageResource(drawableResource)

    }


}