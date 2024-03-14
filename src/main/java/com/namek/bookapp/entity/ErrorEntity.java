package com.namek.bookapp.entity;

import lombok.Builder;

import java.beans.Transient;
import java.time.LocalDateTime;

@Builder
public record ErrorEntity(
        LocalDateTime timeStamp,
        String message,
        @Transient
        String errorAuthor,
        int httpStatus
) {
}
