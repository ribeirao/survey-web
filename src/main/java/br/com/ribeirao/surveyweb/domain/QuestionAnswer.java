package br.com.ribeirao.surveyweb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class QuestionAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Question question;

    @Column
    private String answer;

    public QuestionAnswer() {}

    public QuestionAnswer(Question question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestionId() {
        return question;
    }

    public void setQuestionId(Question question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "QuestionAnswer{" + "id=" + id + ", question=" + question + ", answer='" + answer
                + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        QuestionAnswer that = (QuestionAnswer) o;

        if (id != null ? !id.equals(that.id) : that.id != null)
            return false;
        if (question != null ? !question.equals(that.question) : that.question != null)
            return false;
        return answer != null ? answer.equals(that.answer) : that.answer == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }
}
