package com.danbi.danbiquiz.controller;

import com.danbi.danbiquiz.domain.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class QuizController {
    @GetMapping("/quizzes")
    public ResponseDto getBoards() {
        return ResponseDto.builder().build();
    }

    @GetMapping("/quizzes/{id}")
    public ResponseDto getBoard(@PathVariable Long id) {
        return ResponseDto.builder().build();
    }

    @PostMapping("/quizzes")
    public ResponseDto postBoard() {
        return ResponseDto.builder().build();
    }

    @DeleteMapping("/quizzes/{id}")
    public ResponseDto deleteBoard(@PathVariable Long id) {
        return ResponseDto.builder().build();
    }
}
