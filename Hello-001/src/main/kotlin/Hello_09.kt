fun main() {

    var intNum1 = 0
    var intNum2 = 0
    try {
        print("정수형 숫자 1을 입력하세요")
        var num1:String = scan.nextLine()
        intNum1 = Integer.valueOf(num1)
    } catch (e:NumberFormatException){
        print("숫자 1은 정수만 입력해주세요")
        return
    }

    try {
        print("정수형 숫자 2를 입력하세요")
        var num2:String = scan.nextLine()
        intNum2 = Integer.parseInt(num2)
    } catch (e:NumberFormatException){
        print("숫자 2는 정수만 입력해주세요")
        return
    }

    if (intNum1 !=0 && intNum2 !=0) {
        println("$intNum1 + $intNum2 = ${intNum1 + intNum2}")
        println("$intNum1 - $intNum2 = ${intNum1 - intNum2}")
        println("$intNum1 * $intNum2 = ${intNum1 * intNum2}")
        println("$intNum1 / $intNum2 = ${intNum1 / intNum2}")
    } else {
        println("숫자를 잘못 입력하여 연산 결과를 표시할 수 없음!")
    }
}