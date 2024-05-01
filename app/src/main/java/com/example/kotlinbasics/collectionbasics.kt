package com.example.kotlinbasics

//different ways to create arrays

fun main(){
//creating Int Arrays

    //first way
    val numbers : IntArray = intArrayOf(1,2,3,4,5)
    println(numbers)
    // we directly cant print array so we use utility function contenttostring

    println(numbers.contentToString())



//second way where i dont specify
    val numbers1 = intArrayOf(1,2,3,4,5)
    println(numbers1)
    // we directly cant print array so we use utility function contenttostring

    println(numbers.contentToString())

    //third way i dont specify type of array
    val numbers2 = arrayOf(1,2,4,4)
    println(numbers2)
    // we directly cant print array so we use utility function contenttostring

    println("Inital Values : "+numbers.contentToString())

    numbers[0]=10
    numbers[1]=1
    numbers[2]=3

    println("Updated Values : "+numbers.contentToString())

    //print item individual in array
    for (i in numbers2){
        println("${i + 2}")
    }

    //one element
    println(numbers[1])

        //double array
    val dnumbers2 = doubleArrayOf(1.0,4.0,4.2)
    println(dnumbers2.contentToString())

    //string arra
    val week = arrayOf("sun","mon","tue","wed","thu","fri","sat","sun")
    println(week.contentToString())

    //creating obejcts of data class
    val fruits = arrayOf(fruits("apple",2.2), fruits("banana",40.6))

    println(fruits.contentToString())

    //print only fruit name
    for (fruit in fruits){
        println(fruit.name)
        println(fruit.price)
    }

    //print the index of it
    for (index in fruits.indices){
        println("${fruits[index].name} is an index $index")
    }

    //array mix data type
    val mix = arrayOf("sun","mon","tue","wed",1,2,4.0,5.0,fruits("banana",40.6))
    println(mix.contentToString())

    //--------------------------------------------------------------------------------------------------------------------------------
    //List

    val months = listOf("jan","feb","mar")
    val anytype = listOf(1,2,3,true,false,"hey")

    //to get size of list
    println("size of list of anytype:- "+anytype.size)

    //acces element by index
    println(anytype[2])

    //display by loop
    for (month in months){
        println(month)
    }

    //to make list mutable
    val addmonths = months.toMutableList()
    val newmonths = arrayOf("apr","may","jun")

    //add array into list
    addmonths.addAll(newmonths)
    addmonths.add("jul")

    //display
    println(addmonths)

    //create mutable list of items
    val  days = mutableListOf<String>("mon","tue")
    days.add("wed")

    //remove single element
//    days.removeAt(1)

    //remove filtered item
    val filterditem = mutableListOf<String>("tue")
    days.removeAll(filterditem)
    println(days)

    //------------------------------------------------------------------------------------------------------------------------------
    //sets and maps
    
}

data class fruits (val name:String , val  price:Double){

}