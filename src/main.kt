import java.util.*
fun main(){

    countries()

    pals(arrayOf("Shamsa","Faiza","Samira","Ivy"))

    digits()

    daNames(arrayOf("Zam","Sham","Ram"))






}
fun nName(School:String){
    println(School[0].toString()+School[2]+School[3])
}

fun statement(name:String, age:Int):String{
    var answer= "Hi, my name is $name and I am $age years old"
    return answer
}

fun countries(){
    var cities= arrayOf("harare","Dodoma","Jakarta","mumbai")
    cities.forEach { cities ->
        println(cities.capitalize())
    }
}

fun pals(names:Array<String>){
    println(names.contentToString())
}

fun digits(){
    var numbers=arrayOf(32,17,4,213,78,43,90,313,73,11,158,62)
    var addition= numbers[1] + numbers[4]
    println(addition)

    var number = numbers.indexOf(158)
    println(number)

    var increament= numbers.sortedArray()
    println(Arrays.toString(increament))

}

fun daNames (title:Array<String>):Array<String>{
    var name=title
    println(name.contentToString())
    return(name)
    }



