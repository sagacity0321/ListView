package com.example.listview.datas

class StudentData( // StudentData 생성자 변경: 이름, 출생연도, 폰번 넣어서 생성하도록
    val name: String,
    val birthYear: Int,
    val phoneNum: String
) {
    // 생성자 문법 활용 -> 폰번 없는 생성자
    // Main: 폰번 O
    // Sub: 폰번 X

    // 생성자: Sub
    constructor(name: String, birthYear: Int): this(name, birthYear, "폰번 모름")

    // 현재 한국식 나이를 계산, 리턴해주는 함수
    fun getKoreanAge(year: Int): Int {
        return year - this.birthYear + 1
    }
}