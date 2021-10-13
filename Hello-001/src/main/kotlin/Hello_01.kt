// Kotlin main 진입점 함수
// Kotlin은 기본값이 class가 아니다
// 다만 main() 함수로 시작한다
fun main(){
    println("우리나라만세")

    var num1 = 10
    var num2 = 20
    var sum = num1 + num2

    // 문자열 template 식
    // 문자열 내부에 $변수명 형식으로 작성을 하면
    // 변수값을 그대로 문자열로 변환후 사용할 수 있다
    println("$num1 + $num2 = $sum")

    // ${연산식}형식으로 작성을 하면 연산식을 연산후
    // 결과를 문자열로 반환한다
    println("${num1 * num2}")

    // 변수명 뒤에는 빈칸을 반드시 생성해야한다
    // 빈칸없이 붙여서 사용하려면 변수를 {}로 묶어주어야 한다
    var str = "${num1}과 $num2 의 덧셈 결과 : ${num1 + num2}"

    println(str)

    // num1은 이미 int 형으로 선언이 되었기 때문에
    // 실수형 값을 저장 할 수 없다
    // num1 = 3.0

    // var 변수명:변수타입 = 초기값

    // 정수형
    var var1:Int = 0    // 4byte
    var var2:Long = 0L  // 8byte
    var byte1:Byte = 0  // 1byte 정수(-128 ~ 127)사이

    // 문자열
    var var3:String = "Korea"

    // 문자형
    var char1:Char = 'A'

    // 실수형
    var var4:Float = 3.0F   //4byte
    var var5:Double = 3.0   //8btye

    // 논리형
    var bYes:Boolean = true
    /**
     * Kotlin 의 변수
     * Kotlin 은 변수 type 을 지정하지 않아도 선언, 생성 할 수 있다.
     * 변수는 반드시 초기값을 지정해 주어야 한다.
     * Kotlin 은 변수의 초기값을 보고 변수의 type 을 지정하기 때문이다
     *
     * 변수의 type 은 한번 지정이 되면 다른 type 의 데이터(값)을 지정할수 없다
     *
     * 변수를 선언할때 변수들의 초기 값은 null 이 될수 없다
     *
     * Kotlin에서도 변수 타입을 지정하여 선언할 수 있다.
     * Kotlin의 변수 type 은 클래스 type 이 없다 모두 primitive 방식이다
     * 단, 모든 변수 type 의 키워드는 첫글자가 대문자이다
     *
     * 변수의 type을 별도로 지정해 주는 이유는 Kotlin 문법중에 변수의 초기화 미루기(유예하기) 때문이다
     */
}