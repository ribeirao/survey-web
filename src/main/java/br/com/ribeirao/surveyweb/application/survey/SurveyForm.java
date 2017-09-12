package br.com.ribeirao.surveyweb.application.survey;

import java.util.ArrayList;
import java.util.List;

public class SurveyForm {

    List<QuestionForm> questionFormList = new ArrayList<>();
    private String surveyName;

    public SurveyForm() {}

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
