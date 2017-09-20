package br.com.ribeirao.surveyweb.application.survey;

public class QuestionForm {

    private Integer surveyId;

    private String animation;

    private String statement;

    private String optionA;

    private String animationA;

    private String optionB;

    private String animationB;

    private String optionC;

    private String animationC;

    private String optionD;

    private String animationD;

    private String optionE;

    private String animationE;

    private String correctAnswer;

    private boolean moreQuestion;

    public QuestionForm() {}

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
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

    public boolean isMoreQuestion() {
        return moreQuestion;
    }

    public void setMoreQuestion(boolean moreQuestion) {
        this.moreQuestion = moreQuestion;
    }
}
