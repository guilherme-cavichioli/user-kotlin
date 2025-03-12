package com.cavichioli.userkotlin.repository

import com.cavichioli.userkotlin.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo: JpaRepository<UserEntity, Long> {
}