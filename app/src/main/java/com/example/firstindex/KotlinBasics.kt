package com.example.firstindex

data class  User(val id: Long, var name: String)


fun main() {
    //data classes
    val user1 = User(1,"Marx")

    //Assigning a new value
    //user1.id = 2 // error because val cannot be reassigned
    user1.name = "Michael"
    val user2 = User(1, "Michael")

    println(user1 == (user2))

    println("User Details: $user1")

    //copying one object to another
    val updateUser = user1.copy(name="Ian Marx")
    println(user1)
    println(updateUser)

    println(updateUser.component1())//prints 1
    println(updateUser.component2())//prints Ian Marx

    //deconstruction
    val (id,name) = updateUser// will store them as separate variables according the below code
    println("id=$id, name=$name")//will print id and name separately
   // val id = updatedUser.id
   // val name = updatedUser.name

}
