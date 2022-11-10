package com.example.v2_eco3s

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var behavior = BottomSheetBehavior.from(this.findViewById(R.id.bottomSheet))

        behavior.state = BottomSheetBehavior.STATE_HIDDEN
        //behavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

}