package com.danbi.danbiquiz.domain.entity.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "created_at", updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Column(name = "modified_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifiedAt;

    @Column(name = "modified_by")
    private String modifiedBy;

    @PrePersist
    void created() {
        this.createdAt = LocalDateTime.now();
        this.createdBy = "개발 예정";
        this.modifiedAt = LocalDateTime.now();
        this.modifiedBy = "개발 예정";
    }

    @PreUpdate
    void updated() {
        this.modifiedAt = LocalDateTime.now();
        this.modifiedBy = "개발 예정";
    }
}
