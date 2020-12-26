package com.danbi.danbiquiz.controller;

import com.danbi.danbiquiz.domain.dto.common.ResponseDto;
import com.danbi.danbiquiz.domain.dto.quiz.QuizDto;
import com.danbi.danbiquiz.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @GetMapping("/quizzes")
    public ResponseDto getQuizzes() {
        return ResponseDto.builder()
                .data(quizService.getQuizzes())
                .build();
    }

    @GetMapping("/quizzes/{id}")
    public ResponseDto getQuiz(@PathVariable Long id) {
        return ResponseDto.builder()
                .data(quizService.getQuiz(id))
                .build();
    }

    @PostMapping("/quizzes")
    public ResponseDto postQuiz(@ModelAttribute QuizDto quizDto) {
        quizService.saveQuiz(quizDto);

        return ResponseDto.builder().build();
    }

    @DeleteMapping("/quizzes/{id}")
    public ResponseDto deleteQuiz(@PathVariable Long id) {
        quizService.deleteQuiz(id);

        return ResponseDto.builder().build();
    }
}
