package com.example.OnlineQuiz.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ResultDto {
    private Long id;
    @NotNull(message = "Quiz ID must not be null")
    private Long quizId;
    private LocalDateTime submittedAt;//handled automatically while saving
    @NotEmpty(message = "Total Answers cannot be empty")
   private List<AnswerDto> totalAnswers;
   @NotNull(message = "User ID cannot be null")
    private Long userId;
    private double finalScore;//to store final score when saving

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public List<AnswerDto> getTotalAnswers() {
        return totalAnswers;
    }

    public void setTotalAnswers(List<AnswerDto> totalAnswers) {
        this.totalAnswers = totalAnswers;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
}
