fun main() {
    /**
     * java 에서 배열은 한번 생성이 되면 배열의 크기를 변경 할 수 없다
     *
     * KT 에서는 java 와 같은 배열 요소가 없다
     * List 형의 특별한 데이터 타입만 존재
     *
     * 불변형 List 와 가변형 List 가 있다
     * 불변형 List 는 한번 크기, 요소가 지정되면
     *      요소를 추가, 삭제할 수 없다
     *
     * 가변형 List 는 코드가 실행되는 과정에서
     *      요소를 추가, 삭제할 수 있다
     */
    // 불변형 list
    var lList = listOf(1,2,3,4,5,6)
    // 가변형 list
    var mArray:MutableList<Int> = mutableListOf()
    mArray.add(100)
    mArray.add(200)
    println(mArray)

    // java의 ArrayList를 가져온 가변형 list 데이터
    var aArray:ArrayList<Int> = arrayListOf<Int>()
    aArray.add(100)
    aArray.add(200)
    aArray.add(300)
    println(aArray)
    // 실제 값으로 요소를 제거하기
    aArray.remove(100)
    println(aArray)
    // 인덱스 값으로 요소를 삭제하기
    aArray.removeAt(0)
    println(aArray)
}