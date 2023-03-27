package com.brainjug.roomwithcompose.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)