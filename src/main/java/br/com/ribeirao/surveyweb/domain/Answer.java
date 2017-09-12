package br.com.ribeirao.surveyweb.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int surveyId;

    @OneToMany
    private List<QuestionAnswer> questionAnswerList;

    public Answer() {}

    public Answer(int surveyId, List<QuestionAnswer> questionAnswerList) {
        this.surveyId = surveyId;
        this.questionAnswerList = questionAnswerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public List<QuestionAnswer> getQuestionAnswerList() {
        return questionAnswerList;
    }

    public void setQuestionAnswerList(List<QuestionAnswer> questionAnswerList) {
        this.questionAnswerList = questionAnswerList;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", surveyId=" + surveyId + ", questionAnswerList="
                + questionAnswerList + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Answer answer = (Answer) o;

        if (surveyId != answer.surveyId)
            return false;
        if (id != null ? !id.equals(answer.id) : answer.id != null)
            return false;
        return questionAnswerList != null ? questionAnswerList.equals(answer.questionAnswerList)
                : answer.questionAnswerList == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + surveyId;
        result = 31 * result + (questionAnswerList != null ? questionAnswerList.hashCode() : 0);
        return result;
    }
}
