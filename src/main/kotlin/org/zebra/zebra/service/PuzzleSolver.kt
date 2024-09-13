package org.zebra.zebra.service

import org.zebra.zebra.model.SolverType

interface PuzzleSolver {

    fun solve(input: List<String>): String

    fun type(): SolverType
}