package com.danbi.danbiquiz.domain.dto.quiz;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuizAnswerDto {
    private Long id;
    private String displayText;
    private String displayOrder;
    private Boolean answerYn;
}
