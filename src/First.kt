fun main(args: Array<String>) {
var customer = customer1("John")
    customer.printval()
    customer.Add()



}

open class Customer(var name: String):MainClass() {
    fun printVal(){
       println("Customer name is $name")
    }
    override fun draw() {
        super.draw()
    }//if primary constrauctor is not present then n secondary constructor super is used

    override fun Add() {
        super.Add()
    }
}

open class MainClass{
    open  fun draw(){

    }
   open fun Add(){
        var result = 10+10
       println("Addition $result")
    }

}

 class customer1(name: String):Customer(name){
     fun printval(){
         println(name)
     }

}