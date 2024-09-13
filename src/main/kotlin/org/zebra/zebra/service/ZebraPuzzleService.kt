package org.zebra.zebra.service

import org.springframework.stereotype.Service
import org.zebra.zebra.exception.ZebraException
import org.zebra.zebra.model.SolverType
import org.zebra.zebra.model.response.Output

@Service
class ZebraPuzzleService(private val solvers: List<PuzzleSolver>) {

    fun resolve(input: List<String>, type: SolverType): Output {
        val solver = solvers.find { it.type() == type }
            ?: throw ZebraException("Solver not found for type: $type")
        return Output(solver.solve(input))
    }
}
