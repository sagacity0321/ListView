package com.example.listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listview.R
import com.example.listview.datas.StudentData

class StudentAdapter(
    mContext: Context,
    resId: Int,
    mList: ArrayList<StudentData>
): ArrayAdapter<StudentData>(mContext, resId, mList) { // ArrayAdapter: 기본 생성자 지원X
    val inf = LayoutInflater.from(mContext) // LayoutInflater: XML -> 객체화

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView // 재활용성: convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!! // !!: null이 아님을 보장

        return row
    }
}