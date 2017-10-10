package br.com.ribeirao.surveyweb.domain;

import java.util.List;

import javax.persistence.CascadeType;
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

    @OneToMany(cascade = CascadeType.ALL)
    private List<QuestionAnswer> questionAnswerList;

    private String name;

    private Answer() {}

    public Answer(int surveyId, List<QuestionAnswer> questionAnswerList, String name) {
        this.surveyId = surveyId;
        this.questionAnswerList = questionAnswerList;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", surveyId=" + surveyId + ", questionAnswerList="
                + questionAnswerList + ", name='" + name + '\'' + '}';
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
        if (questionAnswerList != null ? !questionAnswerList.equals(answer.questionAnswerList)
                : answer.questionAnswerList != null)
            return false;
        return name != null ? name.equals(answer.name) : answer.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + surveyId;
        result = 31 * result + (questionAnswerList != null ? questionAnswerList.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
