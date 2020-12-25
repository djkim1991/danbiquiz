package com.danbi.danbiquiz.domain.dto.quiz;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuizQuestionDto {
    private Long id;
    private String displayText;
    private String displayOrder;
    private List<QuizAnswerDto> quizAnswers;
}
