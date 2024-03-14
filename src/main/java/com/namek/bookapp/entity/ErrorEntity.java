package com.namek.bookapp.entity;

import java.beans.Transient;
import java.time.LocalDateTime;

public record ErrorEntity(
        LocalDateTime localDateTime,
        String message,
        @Transient
        String errorAuthor,
        int httpStatus
) {
}
