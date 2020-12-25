package com.danbi.danbiquiz.domain.dto.quiz;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuizDto {
    private Long id;
    private String quizName;
    private List<QuizQuestionDto> quizQuestions;
}
