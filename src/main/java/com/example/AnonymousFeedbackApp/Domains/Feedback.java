package com.example.AnonymousFeedbackApp.Domains;

import com.example.AnonymousFeedbackApp.SupportingLibrary.Criticality;
import jakarta.persistence.*;

@Entity
public class Feedback {

    // TODO: It will be just and Id, feedback, and criticality at
    //  the start. Later I will add the rest.


    @Id
    @SequenceGenerator(
            name = "feedback_id_sequence",
            sequenceName = "feedback_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "feedback_id_sequence"
    )
    private Long id;

    private String feedback;

    private Criticality criticality;



    public Feedback(String feedback, Criticality criticality) {
        this.feedback = feedback;
        this.criticality = criticality;
    }


    // TODO: see why we need to add this constructor.
    public Feedback() {

    }

    public Long getId() {
        return id;
    }

    public String getFeedback() {
        return feedback;
    }

    public Criticality getCriticality() {
        return criticality;
    }

}
