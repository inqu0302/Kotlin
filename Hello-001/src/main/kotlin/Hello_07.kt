import java.util.*

// public(전역) 변수로 scan 을 선언
// type : java.util.Scanner class
// 클래스를 가져와서 객체로 선언 및 생성하기
// 생성자 호출시 new 키워드 없이 바로 호출한다
val scan:Scanner = Scanner(System.`in`)

fun main() {
    print("문자열을 입력 : ")
    var input:String = scan.nextLine()

    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열 형 숫자를 입력 받고
     * 두 숫자의 덧셈을 사칙연산을 수행하여 console에 표시
     */

    print("숫자를 입력하세요 : ")
    var inputInt1 = Integer.parseInt(scan.nextLine())
    print("숫자를 입력하세요 : ")
    var inputInt2 = Integer.parseInt(scan.nextLine())

    print("$inputInt1 + $inputInt2 = ${inputInt1 + inputInt2}")
    print("$inputInt1 - $inputInt2 =  ${inputInt1 - inputInt2}")
    print("$inputInt1 * $inputInt2 =  ${inputInt1 * inputInt2}")
    print("$inputInt1 / $inputInt2 = ${inputInt1 / inputInt2}")
}