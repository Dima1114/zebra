package org.zebra.zebra.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.zebra.zebra.exception.ZebraException
import org.zebra.zebra.model.SolverType

@SpringBootTest
class ZebraPuzzleServiceTest {

    @Autowired
    private lateinit var zebraPuzzleService: ZebraPuzzleService

    @Test
    fun `test resolve with dummy solver`() {
        val input = listOf("There are five houses.....")
        val result = zebraPuzzleService.resolve(input, SolverType.DUMMY)
        assertEquals("Norwegian drinks water and Japanese owns zebra", result)
    }

    @Test
    fun `test resolve with ai solver`() {
        val input = listOf("There are five houses.....")
        val error = assertThrows<ZebraException> {
            zebraPuzzleService.resolve(input, SolverType.AI)
        }
        assertEquals("AI Service is unavailable", error.message)
    }

    @Test
    fun `test resolve with algorithmic solver throws exception`() {
        val input = listOf("There are five houses.....")
        assertThrows<ZebraException> {
            zebraPuzzleService.resolve(input, SolverType.ALGORITHMIC)
        }
    }
}