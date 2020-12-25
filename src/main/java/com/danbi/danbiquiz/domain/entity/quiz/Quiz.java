package com.danbi.danbiquiz.domain.entity.quiz;

import com.danbi.danbiquiz.domain.entity.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "quiz")
@Builder
public class Quiz extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "quiz_name")
    private String quizName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id")
    private List<QuizQuestion> quizQuestions;
}
