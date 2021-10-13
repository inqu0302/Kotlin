/**
 * Kotlin 특징중 하나
 * null 안정형 언어
 * 변수에는 절대 null 값을 저장할 수 없다
 *
 * null 값 비교 : 값이 있냐 없냐
 * 숫자형에서 0이 저장된 경우 : 정말 값이 0인가? 값이 없는가?
 *
 * Kotlin 에서는 safe null 이라는 개념이 없다
 */

fun main() {

    var str1 = ""

    // 제한적으로 str2 변수는 null 을 저장 할 수 있다.
    var str2:String? = null
    println(str2)
    println(str2.toString())

    // "" 와 null 은 다른값
    if(str2 == null){
        println("str2는 null")
    }

    // JS : str = num || "str2는 null"
    println(str2?: "str2 는 null")

    // 만약 str2가 null 이면 str2 에 korea 문자열을 저장장
   str2 = str2?: "Korea"
    println(str2)
}