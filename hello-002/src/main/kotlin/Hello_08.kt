import java.util.*

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    while(true){

        print("정수값을 입력하세요(종료하시려면 END를 입력해주세요) :")
        var strNum = scan.nextLine();

        if(strNum.equals("END")){
            break
        }

        var intNum = try{
            Integer.valueOf(strNum)
        } catch (e:NumberFormatException){
            println("정수만 입력해주세요")
            println("다시 입력해주세요")
            continue
        }

        if(intNum%3 == 0){
            println("$intNum 는 3의 배수입니다")
        }else{
            println("$intNum 는 3의 배수가 아닙니다")
        }
    }
    println("종료되었습니다")
}