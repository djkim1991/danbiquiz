package com.danbi.danbiquiz.domain.entity.quiz;

import com.danbi.danbiquiz.domain.entity.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private Integer displayOrder;

    @Column(name = "answer_yn")
    private Boolean answerYn;
}
