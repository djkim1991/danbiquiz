package com.danbi.danbiquiz.service;

import com.danbi.danbiquiz.domain.dto.quiz.QuizDto;
import com.danbi.danbiquiz.domain.entity.quiz.Quiz;
import com.danbi.danbiquiz.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final ModelMapper modelMapper;
    private final QuizRepository quizRepository;

    public List<QuizDto> getQuizzes() {
        return quizRepository.findAll().stream()
                .map(quiz -> modelMapper.map(quiz, QuizDto.class))
                .collect(Collectors.toList());
    }

    public QuizDto getQuiz(Long id) {
        Quiz quiz = quizRepository.findById(id).orElse(new Quiz());

        return modelMapper.map(quiz, QuizDto.class);
    }

    public void saveQuiz(QuizDto quizDto) {
        Quiz quiz = modelMapper.map(quizDto, Quiz.class);

        quizRepository.save(quiz);
    }

    public void deleteQuiz(Long id) {
        quizRepository.deleteById(id);
    }
}
