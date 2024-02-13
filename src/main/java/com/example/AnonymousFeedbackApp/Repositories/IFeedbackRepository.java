package com.example.AnonymousFeedbackApp.Repositories;

import com.example.AnonymousFeedbackApp.Domains.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Long> {
}
