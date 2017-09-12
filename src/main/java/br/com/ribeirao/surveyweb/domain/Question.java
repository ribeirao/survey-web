package br.com.ribeirao.surveyweb.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "survey_id", nullable = false)
    private Survey survey;

    @Column
    private String animation;

    @Column
    private String statement;

    @Column
    private String optionA;

    @Column
    private String animationA;

    @Column
    private String optionB;

    @Column
    private String animationB;

    @Column
    private String optionC;

    @Column
    private String animationC;

    @Column
    private String optionD;

    @Column
    private String animationD;

    @Column
    private String optionE;

    @Column
    private String animationE;

    @Column
    private String correctAnswer;

    @Column
    private Date creationDate;

    private Question() {}

    public Question(Survey survey, String animation, String statement, String optionA,
            String animationA, String optionB, String animationB, String optionC, String animationC,
            String optionD, String animationD, String optionE, String animationE,
            String correctAnswer) {
        this.survey = survey;
        this.animation = animation;
        this.statement = statement;
        this.optionA = optionA;
        this.animationA = animationA;
        this.optionB = optionB;
        this.animationB = animationB;
        this.optionC = optionC;
        this.animationC = animationC;
        this.optionD = optionD;
        this.animationD = animationD;
        this.optionE = optionE;
        this.animationE = animationE;
        this.correctAnswer = correctAnswer;
        this.creationDate = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getAnimationA() {
        return animationA;
    }

    public void setAnimationA(String animationA) {
        this.animationA = animationA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getAnimationB() {
        return animationB;
    }

    public void setAnimationB(String animationB) {
        this.animationB = animationB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getAnimationC() {
        return animationC;
    }

    public void setAnimationC(String animationC) {
        this.animationC = animationC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnimationD() {
        return animationD;
    }

    public void setAnimationD(String animationD) {
        this.animationD = animationD;
    }

    public String getOptionE() {
        return optionE;
    }

    public void setOptionE(String optionE) {
        this.optionE = optionE;
    }

    public String getAnimationE() {
        return animationE;
    }

    public void setAnimationE(String animationE) {
        this.animationE = animationE;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", animation='" + animation + '\'' + ", statement='"
                + statement + '\'' + ", optionA='" + optionA + '\'' + ", animationA='" + animationA
                + '\'' + ", optionB='" + optionB + '\'' + ", animationB='" + animationB + '\''
                + ", optionC='" + optionC + '\'' + ", animationC='" + animationC + '\''
                + ", optionD='" + optionD + '\'' + ", animationD='" + animationD + '\''
                + ", optionE='" + optionE + '\'' + ", animationE='" + animationE + '\''
                + ", correctAnswer='" + correctAnswer + '\'' + ", creationDate=" + creationDate
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Question question = (Question) o;

        if (id != null ? !id.equals(question.id) : question.id != null)
            return false;
        if (animation != null ? !animation.equals(question.animation) : question.animation != null)
            return false;
        if (statement != null ? !statement.equals(question.statement) : question.statement != null)
            return false;
        if (optionA != null ? !optionA.equals(question.optionA) : question.optionA != null)
            return false;
        if (animationA != null ? !animationA.equals(question.animationA)
                : question.animationA != null)
            return false;
        if (optionB != null ? !optionB.equals(question.optionB) : question.optionB != null)
            return false;
        if (animationB != null ? !animationB.equals(question.animationB)
                : question.animationB != null)
            return false;
        if (optionC != null ? !optionC.equals(question.optionC) : question.optionC != null)
            return false;
        if (animationC != null ? !animationC.equals(question.animationC)
                : question.animationC != null)
            return false;
        if (optionD != null ? !optionD.equals(question.optionD) : question.optionD != null)
            return false;
        if (animationD != null ? !animationD.equals(question.animationD)
                : question.animationD != null)
            return false;
        if (optionE != null ? !optionE.equals(question.optionE) : question.optionE != null)
            return false;
        if (animationE != null ? !animationE.equals(question.animationE)
                : question.animationE != null)
            return false;
        if (correctAnswer != null ? !correctAnswer.equals(question.correctAnswer)
                : question.correctAnswer != null)
            return false;
        return creationDate != null ? creationDate.equals(question.creationDate)
                : question.creationDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (animation != null ? animation.hashCode() : 0);
        result = 31 * result + (statement != null ? statement.hashCode() : 0);
        result = 31 * result + (optionA != null ? optionA.hashCode() : 0);
        result = 31 * result + (animationA != null ? animationA.hashCode() : 0);
        result = 31 * result + (optionB != null ? optionB.hashCode() : 0);
        result = 31 * result + (animationB != null ? animationB.hashCode() : 0);
        result = 31 * result + (optionC != null ? optionC.hashCode() : 0);
        result = 31 * result + (animationC != null ? animationC.hashCode() : 0);
        result = 31 * result + (optionD != null ? optionD.hashCode() : 0);
        result = 31 * result + (animationD != null ? animationD.hashCode() : 0);
        result = 31 * result + (optionE != null ? optionE.hashCode() : 0);
        result = 31 * result + (animationE != null ? animationE.hashCode() : 0);
        result = 31 * result + (correctAnswer != null ? correctAnswer.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
