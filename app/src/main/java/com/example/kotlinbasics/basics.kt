package com.example.kotlinbasics

fun main(){

    //declaration

    var nullname: String?= "hey"

        nullname=null

    //make use of Safe call Operator

    var nullsurname:String?=null

    val surname = nullsurname ?: "Shelare"

    println(surname)

  nullname?.length

//    nullname?.let {println("Length of $nullname :- "+it.length)
//    }


    //variable Declaration
    var name : String = "Umesh" //it is mutable


    //to get the length of String without using Nullable
    if(nullname != null){
        var len:Int = nullname.length
    }else{
        null
    }

    //to get the length of String with Nullable
//    var len2 = nullname?.length








    //Excercise

    var coursename : String = "Umesh"
    val floatval : Float = 13.37F
    val dbl : Double = 3.141592653598979
    var a : Byte = 25
    var a1 : Short = 2020
    var la1 : Long = 18881234567
    var tf : Boolean = true
    var c1: Char = 'X'


    //Comparison

    val isequal = 5==5
    println("is Equal $isequal")

    val notequal = 5!=5
    println("is Equal $notequal")

    println("5>3 ${5>3}")

    var season = 0

    when(season){

        1-> println("Spring")
        2-> println("Rainy")
        3-> {
            println("Summer")
            println("fall")

        }

        else -> {

            println("Wrong Choice")
        }

    }

    //display month Wise Seasons
    var month = 3
    when(month){

        in 3..5 -> println("Spring")
        in 6 .. 8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")

        else -> println("Wrong Choice..")
    }

    //check variable data type

    var x : Any = 13.37

    when(x){

        is Int -> println("$x is Int")
        is Float -> println("$x is Float")
        is String -> println("$x is String")
        is Double -> println("$x is Double")
        else -> println("$x is none of the above")
    }



    for(num in 1..10){

        println("$num")

    }

    for(i in 1 until  10){

        println("$i")

    }

    for(i in 10 downTo 1){

        println("$i")

    }

    for(i in 10 downTo 1 step  2){

        println("$i")

    }

    var inf=0
    while (inf<10000){

        if(inf==9001){
            println("IT'S OVER 9000!!!")
            break
        }


        inf++
    }

    //humdity

    var humid =80

    while (humid>0){

        if(humid==75){

            println("Humidity Decreased")
        }
        else if (humid < 60){

            println("Comfy Now")
        }


        humid--
    }

    println(add(10,20))
}

//function to add two numbers
fun add(a:Int ,  b:Int): Int{
    return  a+b
}


//scope Funtion
//highOrder
//extension Function
