fun main() {

 greetSomeone("Maureen")
 var x = module(12, 5)
 println(x)
 var y=addition(45,23,12,1)
 println(y)
 factAboutMe("i am an introvert")
}
fun greetSomeone(name:String){
 println("hello"+ name)

}
fun module(num1:Int,num2:Int):Int{
 var divide =num1 % num2
 return(divide)

}
fun addition(num1: Int,num2: Int,num3:Int,num4:Int):Int{
 var sum =(num1 + num2 +num3 +num4)
 return(sum)
}
fun factAboutMe(name: String){
 println("i am an introvert")
}
