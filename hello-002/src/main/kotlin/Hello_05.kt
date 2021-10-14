import java.util.*

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())

    var start = rnd.nextInt(100)
    var end = rnd.nextInt(100)

    println("$start, $end")

    /**
     * Random으로 생성된 start 와 end 변수값을 큰 값은 max1 변수에 담고
     * 작은값을 min1 변수에 담아 min~max 까지 범위에서 짝수들의 합을 구하시오
     */
    var min1 = 0
    var max1 = 0

    if(start > end){
        max1 = start
        min1 = end
    } else {
        max1 = end
        min1 = start
    }

    var sum = 0
    for(num in min1..max1){
        if(num %2 ==0){
            sum += num
        }
    }

    println("$min1 과 $max1 사이의 짝수들의 합 : $sum")
}