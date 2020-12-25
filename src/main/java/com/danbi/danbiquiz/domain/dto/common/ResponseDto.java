package com.danbi.danbiquiz.domain.dto.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseDto<T> {
    @Builder.Default
    private String status = "success";
    private T data;
}
