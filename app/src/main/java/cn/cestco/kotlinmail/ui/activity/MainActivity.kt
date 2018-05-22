package cn.cestco.kotlinmail.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.cestco.kotlinmail.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTv.setOnClickListener({ mTv.text = "dddd"  })
    }
}
