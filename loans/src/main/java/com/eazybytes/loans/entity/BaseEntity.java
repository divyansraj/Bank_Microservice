package com.eazybytes.loans.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@ToString
public class BaseEntity {
    @Column(updatable = false)
    private LocalDateTime createdBy;

    @Column(updatable = false)
    private String createdAt;

    @Column(updatable = false)
    private String updatedBy;

    @Column(updatable = false)
    private LocalDateTime updatedAt;
}
