package com.cavichioli.userkotlin.endpoint

import com.cavichioli.userkotlin.model.UserEntity
import com.cavichioli.userkotlin.service.UserService
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<UserEntity>> {
        return ResponseEntity.ok(userService.getAllUsers())
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<UserEntity> {
        return ResponseEntity.ok(userService.getUserById(id))
    }

    @PostMapping
    fun createUser(@RequestBody userEntity: UserEntity): ResponseEntity<UserEntity> {
        return ResponseEntity.ok(userService.createUser(userEntity))
    }

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Long, @RequestBody userEntity: UserEntity): ResponseEntity<UserEntity> {
        return ResponseEntity.ok(userService.updateUser(id, userEntity))
    }

    @DeleteMapping("/{id}")
    fun deleteUserById(@PathVariable id: Long): ResponseEntity<Void> {
        userService.deleteUserById(id)
        return ResponseEntity.noContent().build()
    }

}