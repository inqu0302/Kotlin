fun main() {

    /**
     * 숫자를 다루는 코드에서는
     * 0이 입력되면 않되는 코드가 있고 0이 들어올수도 있는 코드가 있다
     * 그렇기 때문에 0으로 검사를 하기보다는 null인지 아닌지로 검사를 하는것이 
     * 더 정확하다
     * 
     * 변수:타입? = null 처럼 null로 초기화된 변수를 선언한다
     */
    
    // intNum1을 Int 형으로 선언 후 null 값을 허용한다
    var intNum1:Int? = null
    var intNum2:Int? = null
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

    if (intNum1 != null && intNum2 != null) {
        println("$intNum1 + $intNum2 = ${intNum1 + intNum2}")
        println("$intNum1 - $intNum2 = ${intNum1 - intNum2}")
        println("$intNum1 * $intNum2 = ${intNum1 * intNum2}")
        println("$intNum1 / $intNum2 = ${intNum1 / intNum2}")
    } else {
        println("숫자를 잘못 입력하여 연산 결과를 표시할 수 없음!")
    }
}