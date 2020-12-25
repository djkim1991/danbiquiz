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
    public ResponseDto getBoards() {
        return ResponseDto.builder()
                .data(quizService.getQuizzes())
                .build();
    }

    @GetMapping("/quizzes/{id}")
    public ResponseDto getBoard(@PathVariable Long id) {
        return ResponseDto.builder()
                .data(quizService.getQuiz(id))
                .build();
    }

    @PostMapping("/quizzes")
    public ResponseDto postBoard(@ModelAttribute QuizDto quizDto) {
        quizService.saveQuiz(quizDto);

        return ResponseDto.builder().build();
    }

    @DeleteMapping("/quizzes/{id}")
    public ResponseDto deleteBoard(@PathVariable Long id) {
        quizService.deleteQuiz(id);

        return ResponseDto.builder().build();
    }
}
