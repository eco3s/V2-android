package com.example.v2_eco3s

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.android.material.bottomsheet.BottomSheetBehavior

class SignupActivity : AppCompatActivity() {

    private val TIME_OUT: Long = 150

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val behavior = BottomSheetBehavior.from(this.findViewById(R.id.bottomSheet))
        behavior.state = BottomSheetBehavior.STATE_HIDDEN

        Handler().postDelayed({
            //레이아웃에 저장한 peekHeight만큼 보임
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }, TIME_OUT)
    }

}