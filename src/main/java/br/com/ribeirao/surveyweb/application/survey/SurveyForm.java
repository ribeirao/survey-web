package br.com.ribeirao.surveyweb.application.survey;

import java.util.ArrayList;
import java.util.List;

public class SurveyForm {

    private String surveyName;

    List<QuestionForm> questionFormList = new ArrayList<>();

    public SurveyForm() {
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public List<QuestionForm> getQuestionFormList() {
        return questionFormList;
    }

    public void setQuestionFormList(List<QuestionForm> questionFormList) {
        this.questionFormList = questionFormList;
    }
}
