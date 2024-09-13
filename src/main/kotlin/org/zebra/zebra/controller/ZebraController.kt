package org.zebra.zebra.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.zebra.zebra.model.request.Input
import org.zebra.zebra.model.response.Output
import org.zebra.zebra.service.ZebraPuzzleService

@RestController
@RequestMapping("/zebra")
class ZebraController(private val zebraPuzzleService: ZebraPuzzleService) {

    @PostMapping("/solve")
    fun solvePuzzle(@RequestBody input: Input): Output {
        return zebraPuzzleService.resolve(input.clues, input.type)
    }
}