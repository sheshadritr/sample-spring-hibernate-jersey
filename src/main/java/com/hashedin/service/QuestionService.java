package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Question;
import com.hashedin.model.QuestionCount;
import com.hashedin.model.QuestionView;
import com.hashedin.model.Tag;

public interface QuestionService {
	
	Question find(Long questionId);
    List<Question> findAll();
    List<Tag> findTagsForQuestion( Long questionId);
    List<QuestionCount> findNoOfQuestions();
	QuestionView findSumOfViews();
}
