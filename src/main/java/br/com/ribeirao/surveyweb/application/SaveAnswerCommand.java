package br.com.ribeirao.surveyweb.application;

import java.util.List;

public class SaveAnswerCommand {

    private int surveyId;
    private List<SaveQuestionAnswerCommand> questionAnswers;

    private SaveAnswerCommand() {}

    public SaveAnswerCommand(int surveyId, List<SaveQuestionAnswerCommand> questionAnswers) {
        this.surveyId = surveyId;
        this.questionAnswers = questionAnswers;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public List<SaveQuestionAnswerCommand> getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(List<SaveQuestionAnswerCommand> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    @Override
    public String toString() {
        return "SaveAnswerCommand{" + "surveyId=" + surveyId + ", questionAnswers="
                + questionAnswers + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SaveAnswerCommand that = (SaveAnswerCommand) o;

        if (surveyId != that.surveyId)
            return false;
        return questionAnswers != null ? questionAnswers.equals(that.questionAnswers)
                : that.questionAnswers == null;
    }

    @Override
    public int hashCode() {
        int result = surveyId;
        result = 31 * result + (questionAnswers != null ? questionAnswers.hashCode() : 0);
        return result;
    }
}
