package com.example.AnonymousFeedbackApp.Services;

import com.example.AnonymousFeedbackApp.Domains.Feedback;
import com.example.AnonymousFeedbackApp.Repositories.IFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

// TODO: later create a dto and add validations

    @Autowired
    private IFeedbackRepository repository;


    public void addFeedback(Feedback feedback)
    {
       repository.save(feedback);
    }

    public List<Feedback> getAllFeedbacks()
    {
        return repository.findAll();
    }

}
