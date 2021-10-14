import java.util.*

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    print("문자열을 입력하세요 : ")
    var input:String = scan.nextLine()

    println("입력한 문자열 : $input")

    print("한자리의 정수를 입력하세요 : ")
    var strNum:String = scan.nextLine()

    // 숫자가 아닌 다른 값을 입력받았을대 Exception 이 발생할수 있기 때문에
    // try-catch 로 처리를 해준다
    var intNum = 0
    try {
        intNum = Integer.valueOf(strNum)
    } catch (e:NumberFormatException){
        println("정수만 입력해 주세요")
        println("입력하신 문자 : $strNum")
        return
    }
    println("입력한 숫자 $intNum")

}