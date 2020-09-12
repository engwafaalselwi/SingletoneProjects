class A2{
    init {
        println("Class init method")
    }
    object SingletonA{
        init {
            println("SingletonA class invoke")
        }
        var name:String = " Kotlin ObjectsA"

        fun printName(){
            println(name)
        }
    }
    companion object SingletonB {
        init{
            println("SingletonB class invoke")
        }
        var name:String = " Kotlin ObjectsB"

        fun printName(){
            println(name)
        }

    }

}
fun main(){
    var a = A2
    var a2 = A2.name
    A2.name = "Kotlin  Tutorials"
    A2.printName()

}