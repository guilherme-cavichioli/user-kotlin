package com.cavichioli.userkotlin.service

import com.cavichioli.userkotlin.model.UserEntity
import com.cavichioli.userkotlin.repository.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class UserService {

    @Autowired
    lateinit var userRepository : UserRepo

    fun getAllUsers(): List<UserEntity> {
        return userRepository.findAll()
    }

    fun createUser(userEntity: UserEntity): UserEntity {
        return userRepository.save(userEntity)
    }

    fun updateUser(id: Long, newUserEntity: UserEntity): UserEntity {
        val user = userRepository.findById(id)
                .orElseThrow{ RuntimeException("Usuário com id $id, não encontrado") }

        user.apply {
            this.name = newUserEntity.name
            this.email = newUserEntity.email
        }

        return userRepository.save(user)
    }

    fun getUserById(id: Long): UserEntity {
        return userRepository.findById(id)
                .orElseThrow{ RuntimeException("Usuário com id $id, não encontrado") }
    }

    fun deleteUserById(id: Long) {
        val user = getUserById(id)
        userRepository.deleteById(id)
    }

}