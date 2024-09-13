package org.zebra.zebra.model.request

import org.jetbrains.annotations.NotNull
import org.zebra.zebra.model.SolverType

data class Input(
    @NotNull val clues: List<String>,
    @NotNull val type: SolverType
)
