package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.listview.adapters가.StudentAdapter
import com.example.listview.databinding.ActivityMainBinding
import com.example.listview.datas.StudentData

class MainActivity : AppCompatActivity() {
    val mStudentList = ArrayList<StudentData>()
    lateinit var mStdAdapter: StudentAdapter // lateinit: 나중에 대입할거야
    lateinit var binding: ActivityMainBinding // DataBinding: XML -> 객체화
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 화면 켜질 때 학생 목록을 ArrayList에 수동으로 추가
        mStudentList.add(StudentData("조경진", 1988, "010-1234-5678"))
        mStudentList.add(StudentData("김광철", 1966, "010-9876-5432"))
        mStudentList.add(StudentData("김재환", 1993, "010-5555-6666"))
        mStudentList.add(StudentData("박수정", 1994, "010-1111-2222"))
        mStudentList.add(StudentData("신용성", 1988, "010-1234-5678"))
        mStudentList.add(StudentData("신용성", 1988))

        // Adapter 객체 생성
        mStdAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        // Adapter를 리스트뷰와 연결
        binding.studentListView.adapter = mStdAdapter

    }
}