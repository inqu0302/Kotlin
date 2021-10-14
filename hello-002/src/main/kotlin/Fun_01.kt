// 진입점 함수
fun main() {
    var result1 = add(100,200)
    var result2 = add(100.0f, 200.0f)

    print("$result1, $result2")
}

// 함수를 사용하여 코드 분리하기
// fun 키워드를 사용하여 함수를 정의한다

// void 형 함수
// void method(int a, int b) : JAVA
// fun method(a:Int, b:Int){} : Kotlin

// return type 정수형인 함수
// int 함수명 ( int 매개변수 ) {} : JAVA
// fun 함수명 ( 매개변수:Int ) : Int {} : Kotlin

/**
 * 함수형 프로그래밍
 * 순수함수 개념
 * java에서  method는 매개변수로 전달받은 변수에 연산을 통하여 값을
 * 저장, 수정, 삭제 할 수 있다
 * 단순히 매개변수에 어떤 값을 할당 할 수 있다.
 *
 * 하지만 kotlin 에서는 매개변수를 절대 변경할 수 없다
 * 순수함수를 유지하기위한 Kotlin의 정책
 */
fun add(num1:Int, num2:Int):Int {

    // kotlin 에서는 매개변수를 임의로 변경할 수 없다다
   // num1 += 10
    // num2 += 20
    var sum = num1 + num2
    return sum
}

// 객체지향에서의 다형성
fun add(num1:Float, num2:Float):Float{
    return num1 + num2
}