package io.xeounxzxu.springbatchbigdataflowsample.domain

import jakarta.persistence.*

@Entity(name = "item")
@Table
class ItemEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,
    @Column(nullable = false)
    val name: String
)
