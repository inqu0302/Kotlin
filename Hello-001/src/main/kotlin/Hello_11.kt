fun main() {

    /**
     * 3항 연산 try
     * Integer.valueOf(num1) 실행이 정상적으로 종료되면
     * 연산결과가 intNum1에 담기고
     * Exception 이 발생하면 오류메시지가 출력되고 null값이 담긴다
     */
    print("정수형 숫자 1을 입력하세요")
    var num1:String = scan.nextLine()
    
    var intNum1:Int? =  try {
        Integer.valueOf(num1)
    } catch (e:NumberFormatException){
        print("숫자 1은 정수만 입력해주세요")
        null
    }

    print("정수형 숫자 2를 입력하세요")
    var num2:String = scan.nextLine()
    
    var intNum2:Int? = try {
        Integer.parseInt(num2)
    } catch (e:NumberFormatException){
        print("숫자 2는 정수만 입력해주세요")
        null
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