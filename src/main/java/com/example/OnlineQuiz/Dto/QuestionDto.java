package com.example.OnlineQuiz.Dto;

import com.example.OnlineQuiz.Entity.QuizEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;



@Data
public class QuestionDto {
    private Long id;
    @NotBlank(message = "question cannot be empty")
    private String question;
    @NotBlank(message = "option1 must be given")
    private String option1;
    @NotBlank(message = "option2 must be given")
    private String option2;
    @NotBlank(message = "option3 must be given")
    private String option3;
    @NotBlank(message = "option4 must be given")
    private String option4;
    @NotBlank(message = "correct option must be given")
    private String correctOption;
    @NotNull(message = "Quiz Id cannot be null")
    private Long quizId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
}
