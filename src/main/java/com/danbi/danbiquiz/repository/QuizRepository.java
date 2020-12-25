package com.danbi.danbiquiz.repository;

import com.danbi.danbiquiz.domain.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
