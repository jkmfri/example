package jkm.example.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member(
    val name: String,
    val email: String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int = 0
}