package org.zebra.zebra.service

import org.springframework.ai.openai.OpenAiChatModel
import org.springframework.stereotype.Service
import org.zebra.zebra.exception.ZebraException
import org.zebra.zebra.model.SolverType

@Service
class AiPuzzleSolver(var aiChat: OpenAiChatModel) : PuzzleSolver {

    companion object {
        const val PROMPT_START = "Here is a Zebra puzzle. Find The solution and write a 1 line answer\n"
    }

    override fun solve(input: List<String>): String {
        return try {
            aiChat.call(PROMPT_START + input.joinToString("\n"))
        } catch (ex: Exception) {
            throw ZebraException("AI Service is unavailable")
        }
    }

    override fun type() = SolverType.AI
}