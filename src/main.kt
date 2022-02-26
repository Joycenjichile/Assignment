fun main (){
    var org="Akirachix"
    print(org[0])
    print(org[2])
    println(org[3])
    var x= parameter("joy",22)
    println (x)
    var takeString="Nkimalantoi"
    println("the length of my name is " +takeString.length)
    var r="joyc"
    if(r=="dad")
     println("that's me")
    else{
        println("that's not me")
    }



}
fun parameter(t:String,w:Int):String{
    var name= "Hi my name is $t $w"
    return name
}



