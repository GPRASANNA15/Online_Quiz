package com.example.OnlineQuiz.Repository;

import com.example.OnlineQuiz.Entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity,Long> {
    Optional<List<QuestionEntity>> findByQuizId(long id);
}
