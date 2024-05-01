package com.example.kotlinbasics

interface Drivable{
    val  maxSpeed : Double
    fun drive():String
    fun brake(){
        println("The Drivable is Breaking")
    }

}

open class CarInterface( override val maxSpeed: Double,val name:String,val brand:String) : Drivable{


    override fun drive(): String = " Driving the interface Drive "
    
}
