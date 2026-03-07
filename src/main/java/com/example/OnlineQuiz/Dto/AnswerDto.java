package com.example.OnlineQuiz.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.time.LocalDateTime;

@Data
public class AnswerDto {

    @NotNull(message = "Question ID cannot be null")
    private Long questionId;
    @NotBlank(message = "option cannot be blank for a question")
    private String option;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
