package com.example.kursovaia2;

import com.example.kursovaia2.Question;

import java.util.Collection;
import java.util.Collections;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}