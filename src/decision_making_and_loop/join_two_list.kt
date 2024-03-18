fun main(args: Array<String>) {
    val arrayList1 = ArrayList<Int>()
    arrayList1.add(1)

    val arrayList2 = ArrayList<Int>()
    arrayList2.add(2)

    val joinedList = ArrayList<Int>()
    joinedList.addAll(arrayList1)
    joinedList.addAll(arrayList2)


    println("list1: $arrayList1")
    println("list2: $arrayList2")
    println("joined: $joinedList")
}