package org.jotace.billionaireapp

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val typeface = Typeface.createFromAsset(assets, "Stylish-Regular.ttf")
        billionareTittle.typeface = typeface

        val billionareMessages = arrayOf(
            getText(R.string.message1),
            getText(R.string.message2),
            getText(R.string.message3),
            getText(R.string.message4),
            getText(R.string.message5),
            getText(R.string.message6),
            getText(R.string.message7),
            getText(R.string.message8),
            getText(R.string.message9),
            getText(R.string.message10),
            getText(R.string.message11),
            getText(R.string.message12),
            getText(R.string.message13)
        )


        billionareButton.setOnClickListener {
            val messageIndex = Random.nextInt(0, 12);
            val msg = billionareMessages[messageIndex];
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, msg, duration);
            toast.show();
        }

    }
}
