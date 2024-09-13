package org.zebra.zebra.service

import org.springframework.stereotype.Service
import org.zebra.zebra.model.SolverType

@Service
class DummyPuzzleSolver : PuzzleSolver {

    override fun solve(input: List<String>) = "Norwegian drinks water and Japanese owns zebra"

    override fun type() = SolverType.DUMMY
}