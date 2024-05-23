package kr.ac.kopo.dialog2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog =findViewById<Button>(R.id.btnDialog)
        
        //체크박스 버튼 목록 대화상자
        btnDialog.setOnClickListener{
            var placesArr = arrayOf("프라하","카파도키아","포르투")
            var selectArr = booleanArrayOf(false, true, false)
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 핫플")
            dialog.setIcon(R.drawable.conversation)
            //d1: 클릭된 대화 상자를 나타내는 DialogInterface 객체.
            //which: 클릭된 항목의 인덱스를 나타내는 Int.
            dialog.setMultiChoiceItems(placesArr, selectArr){ d1, which, isChecked ->
                btnDialog.text =placesArr[which]

            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()

        }
    }
}