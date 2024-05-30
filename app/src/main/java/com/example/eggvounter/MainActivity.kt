package com.example.eggvounter

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.eggvounter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up)
        val scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down)

        binding.egg.setOnClickListener {
            count++
            binding.Counter.text=count.toString()
            val mediaPlayer :MediaPlayer = MediaPlayer.create(this,R.raw.egg_sound);
            mediaPlayer.start();

            binding.egg.startAnimation(scaleUp)
            binding.egg.startAnimation(scaleDown)

        }
    }


}