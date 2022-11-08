package com.example.v2_eco3s

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialog

class SignupActivity : AppCompatActivity() {
    // bottomSheetDialog 객체 생성
    // -> 뷰 객체로 생성
    lateinit var sheetLayout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        sheetLayout = LayoutInflater.from(this).inflate(R.layout.layout_bottom_sheet,null, false)

        // bottomSheetDialog 뷰 생성
        var sheetDialog = BottomSheetDialog(this)
        sheetDialog.setContentView(sheetLayout)

        // bottomSheetDialog 호출
        sheetDialog.show()

        // bottomSheetDialog를 액티비티 시작할때 시작하게 만들기
        // Splash 액티비티 끝나면 바로 실행하게 됨
    }
}