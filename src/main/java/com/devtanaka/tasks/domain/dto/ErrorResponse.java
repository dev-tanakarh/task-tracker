package com.devtanaka.tasks.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
