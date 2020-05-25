package com.androidshowtime.basicphrases

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun playSound(view: View) {

        val button = view as Button

        val mediaPlayer = MediaPlayer.create(
            this,
            resources.getIdentifier(button.tag.toString(), "raw", packageName)
        )
        mediaPlayer.start()
    }


}
