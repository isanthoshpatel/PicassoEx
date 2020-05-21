package com.example.picassoex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Picasso.get().load("https://images.firstpost.com/wp-content/uploads/2020/05/92885654_111301663692310_3338288297284155964_n-2.jpg").fit().into(imageView1)


        Picasso.get().load(R.drawable.dishapatani).resize(200,200).centerCrop(Gravity.TOP).onlyScaleDown().into(imageView2)
    }

}
