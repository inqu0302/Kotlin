fun main() {

    // for( int i = 0 ; i < 10 ; i++){ System.out.print(i) }
    for (num in 0..9){
        print("$num,")
    }

    var sum = 0

    println()
    // for( int i = 0; i <= 10; i++) {sum += i}
    for(num in 1..10){
        sum += num
    }
    println("1 ~ 10 까지 덧셈 : $sum")

    // i < 10
    for(num in 0 until 10){
        print(num)
    }

    println()

    // for (int i = 10 ; i >= 0; i--){}
    for(num in 10 downTo 1){
        print("$num,")
    }

    println()

    for(num in 0..10 step 2){
        print("$num,")
    }

    println()

    for(num in 0..10){
        if(num % 2 ==0){
            print("$num,")
        }
    }
}