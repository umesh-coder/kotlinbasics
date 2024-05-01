package com.example.kotlinbasics

fun  main(){

    val  mycar = Car("A3","BMW")
    val myecar = ElectricCar("A40","BMW",95.6)

    myecar.extendRange(200.0)

    mycar.drive(201.88)
    myecar.drive(220.2)



    val umesh =Person("Umesh","Shelare")
    val default = Person()

    val Samsung_Galaxy_S20_Ultra = MobilePhone("Android","Samsung","Galaxy S20 Ultra")


    var u1 = User(12,"Umesh")
    val uu1 = u1.copy(10,"nawatha")

    println("object 1 : - "+u1)
    println("object 2 : - "+uu1)

    //by using component

    println(uu1.component1())
    println(uu1.component2())

    //split into variable
    val (id, name) = uu1
    println("Name :- $name and ID : $id")
}
class Person (fname:String = "Default First Name",lname:String="Default Last Name"){

    init {
        println("Person Created With $fname $lname")
    }

}

class MobilePhone (osName:String ,brand:String  , model:String){

    init {
        println("osName :- $osName  brand :- $brand and model :- $model")
    }
}

data class  User(val id:Long,val name: String){

}

//Inheritance

//super class , Parent class or Base class
open class Vehicle {
    //properties
    //methods
}

//sub class of vehicle , child or derived class
open class Car(val name: String,val brand: String){
    open var range:Double =0.0

    fun extendRange(amount : Double){

        if (amount>0){

            range+=amount
        }
    }

    open fun drive(distance : Double){

        println("Drove Distance  $distance KM")
    }

    //properties
    // methods

}

//sub class of Car , child or derived class
class ElectricCar(name :String,brand: String,batterylife:Double) : Car(name, brand ){

    override var range = batterylife * 6

    override fun drive(distance: Double){

        println("Drove distance $distance KM on Electricity")
    }

    fun drive(){

        println("Drove of $range KM on Electrcity")
    }

}