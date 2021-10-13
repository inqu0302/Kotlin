fun main() {

    /**
     * var : 내용이 변경 가능한 변수
     * val : 한번 저장되면 내용을 변경할수 없다 (상수)
     */
    val str1 = "Korea"
    // str1 = "reqpublic of Korea" 오류발생
    
    // listOf() 리스트형 변수를 생성하는 함수
    // Arraylist와 비슷함
    val 과일들 = listOf("사과", "바나나", "오렌지")

    // 리스트 내의 요소들을 하나씩 과일이라는 변수에 담아 출력하기기
   for(과일 in 과일들){
        println(과일)
    }

    // indices 각 요소의 index값을 뽑아냄
    for(index in 과일들.indices){
        println("$index 번째 : ${과일들[index]}")
    }


    if(3 in 1..10){ println("있다") }

    for(num in 1..10){
        if(num == 3){
            println("있다")
        }
    }

    // 과일들 리스트내에 사과라는 요소가 있는가?
    if("사과" in 과일들) {
        println("사과가 있음")
    }
    for(과일 in 과일들){
        if(과일 == "사과"){
            println("사과있음")
            break
        }
    }

    // 과일들 리스트내에 배라는 요소가 없는가?
    if("배" !in 과일들){
        println("배가 없다")
    }
}