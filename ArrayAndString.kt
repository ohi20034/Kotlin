fun main() {
    val myArr = arrayOf(1, 2, 3, 4)
    for(i in 0..myArr.size-1){
        print("${myArr[i]} ")
    }
    println()
    for(element in myArr){
        print("$element ")
    }
    println()
    val myStr1 = "Imdadul Haque Ohi"
    val myStr2 = "ImdadulHaque Ohi"
    println(myStr1==myStr2)
}
