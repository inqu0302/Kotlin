import java.util.*

var rnd:Random = Random(System.currentTimeMillis())

fun main(){

    var scan:Scanner = Scanner(System.`in`)

    while(true){
        prime()
        println("계속 할까요?...(END: 끝내기)")

        var input:String = scan.nextLine()

        if(input.equals("END")) break;

    }

}

fun prime() {

    var num1:Int = rnd.nextInt(100)

    println("생성된 난수 : $num1")

    // range 데이터
    // filter = true 인 값만 담는다
    // num1값과 % 연산을 하여 결과가 0 인 요소만 추출하여 resultArray에 저장
    var resultArray = (2 until num1).filter{num1 % it == 0}
    print(resultArray)
    
    if(resultArray.isEmpty()){
        println("$num1 은 소수이다")
    } else{
        println("$num1 은 소수가 아니다")
    }
}