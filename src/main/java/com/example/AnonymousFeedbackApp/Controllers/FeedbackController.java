package com.example.AnonymousFeedbackApp.Controllers;


import com.example.AnonymousFeedbackApp.Domains.Feedback;
import com.example.AnonymousFeedbackApp.Services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService service;

    // Having @RequestBody before the object request
    // means that the returned json body will be mapped to request
    @PostMapping
    public void addFeedback(@RequestBody Feedback request)
    {
        service.addFeedback(request);
    }

    @GetMapping
    public ResponseEntity<List<Feedback>> getAllFeedbacks()
    {
        List<Feedback> list = service.getAllFeedbacks();
        return ResponseEntity.ok(list);
    }

}
