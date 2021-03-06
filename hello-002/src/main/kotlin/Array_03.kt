fun main() {

    // key 와 value 를 쌍으로 갖는 데이터 타입
    val map1 = mapOf("name" to "홍길동",
                    "tel" to "010-1111-2222",
                    "addr" to "서울시")

    println(map1["name"])

    for((key, value) in map1){
        println("Key : $key , Value : $value")
    }

    val map2 = mutableMapOf(
        "name" to "이몽룡",
        "tel" to "010-111-1111",
        "addr" to "남원시"
    )
    println(map2)
    map2["tel"] = "010-222-2222"
    println(map2)

}