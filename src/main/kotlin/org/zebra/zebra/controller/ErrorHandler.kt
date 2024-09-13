package org.zebra.zebra.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.zebra.zebra.exception.ZebraException
import org.zebra.zebra.model.response.Output

@ControllerAdvice
class ErrorHandler {

    @ExceptionHandler(ZebraException::class, HttpMessageNotReadableException::class)
    fun handleZebraException(ex: Exception): ResponseEntity<Output> {
        return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(Output(ex.message ?: "Error occurred"))
    }
}