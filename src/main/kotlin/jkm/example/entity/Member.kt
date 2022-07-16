package jkm.example.entity

import javax.persistence.Entity

@Entity
class Member(
    val name: String,
    val email: String
)