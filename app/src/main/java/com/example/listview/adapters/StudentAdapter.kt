package com.example.listview.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listview.datas.StudentData

class StudentAdapter(
    mContext: Context,
    resId: Int,
    mList: ArrayList<StudentData>
): ArrayAdapter<StudentData>(mContext, resId, mList) { // ArrayAdapter: 기본 생성자 지원X
}