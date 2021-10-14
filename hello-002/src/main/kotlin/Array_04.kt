fun main() {
    var numbers = Array(45, {index -> index+1})

    viewList(numbers)
    println("=".repeat(50))

    // Collection 에 담긴 데이터를 무작위로 섞어주는 함수
    numbers.shuffle()
    viewList(numbers)

    var lottoNum = numbers.slice(0..5)
    println(lottoNum.sorted())
}

fun viewList(numbers:Array<Int>){
    for( (index,num) in numbers.withIndex()){
        print("$num,")
        if((index + 1) % 5 == 0) println()
    }
}