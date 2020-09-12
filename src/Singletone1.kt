object Singleton {
    init{
        println("Singleton class invoke")
    }
    var name:String = " Kotlin Objects"

    fun printName(){
        println(name)
    }
 class A {
     init {
         println("class init method .Singleton name property $name")
         printName()
     }
 }

}

fun main() {
    Singleton.printName()
    Singleton.name=" kk "
    var a = Singleton.A()
}