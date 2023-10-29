package com.example.listview.adapters가

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listview.R
import com.example.listview.datas.StudentData

class StudentAdapter(
    mContext: Context,
    resId: Int,
    val mList: ArrayList<StudentData>
): ArrayAdapter<StudentData>(mContext, resId, mList) { // ArrayAdapter: 기본 생성자 지원X
    val inf = LayoutInflater.from(mContext) // LayoutInflater: XML -> 객체화

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView // 재활용성: convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        // xml을 그려낸 row 객체
        val row = tempRow!! // !!: null이 아님을 보장

        val stdData = mList[position]// 학생객체 추출

        // row 내부의 텍스트뷰들을 가져오기
        // Adapter에서는 DataBinding 사용 불가 -> 직접 코드로 불러내야 함
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtPhoneNum = row.findViewById<TextView>(R.id.txtPhoneNum)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)

        txtName.text = stdData.name
        txtPhoneNum.text = stdData.phoneNum
        txtAge.text = "(${stdData.getKoreanAge(2023)}세)"

        return row
    }
}