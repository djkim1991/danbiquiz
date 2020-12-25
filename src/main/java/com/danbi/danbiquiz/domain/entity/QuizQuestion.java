package com.danbi.danbiquiz.domain.entity;

import com.danbi.danbiquiz.domain.entity.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

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
    private String displayOrder;
}
