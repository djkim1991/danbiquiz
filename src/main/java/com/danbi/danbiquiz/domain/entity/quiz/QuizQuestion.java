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
@Table(name = "quiz_question")
@Builder
public class QuizQuestion extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "display_text")
    private String displayText;

    @Column(name = "display_order")
    private Integer displayOrder;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "quiz_question_id")
    private List<QuizAnswer> quizAnswers;
}
