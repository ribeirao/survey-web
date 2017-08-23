package br.com.ribeirao.surveyweb.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Survey survey;

    @OneToMany
    private List<QuestionAnswer> questionAnswerList;

    public Answer() {}

    public Answer(Long id, Survey survey, List<QuestionAnswer> questionAnswerList) {
        this.id = id;
        this.survey = survey;
        this.questionAnswerList = questionAnswerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public List<QuestionAnswer> getQuestionAnswerList() {
        return questionAnswerList;
    }

    public void setQuestionAnswerList(List<QuestionAnswer> questionAnswerList) {
        this.questionAnswerList = questionAnswerList;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", survey=" + survey + ", questionAnswerList="
                + questionAnswerList + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Answer answer = (Answer) o;

        if (id != null ? !id.equals(answer.id) : answer.id != null)
            return false;
        if (survey != null ? !survey.equals(answer.survey) : answer.survey != null)
            return false;
        return questionAnswerList != null ? questionAnswerList.equals(answer.questionAnswerList)
                : answer.questionAnswerList == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (survey != null ? survey.hashCode() : 0);
        result = 31 * result + (questionAnswerList != null ? questionAnswerList.hashCode() : 0);
        return result;
    }
}
