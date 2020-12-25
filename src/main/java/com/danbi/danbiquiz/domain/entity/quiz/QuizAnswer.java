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
@Table(name = "quiz_answer")
@Builder
public class QuizAnswer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "display_text")
    private String displayText;

    @Column(name = "display_order")
    private String displayOrder;

    @Column(name = "answer_yn")
    private Boolean answerYn;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_question_id")
    private List<QuizAnswer> quizAnswers;
}
