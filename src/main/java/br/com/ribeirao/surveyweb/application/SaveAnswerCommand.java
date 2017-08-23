package br.com.ribeirao.surveyweb.application;

import java.util.List;

public class SaveAnswerCommand {

    private int surveyId;
    private List<SaveQuestionAnswerCommand> saveQuestionAnswerCommands;

    private SaveAnswerCommand() {}

    public SaveAnswerCommand(int surveyId,
            List<SaveQuestionAnswerCommand> saveQuestionAnswerCommands) {
        this.surveyId = surveyId;
        this.saveQuestionAnswerCommands = saveQuestionAnswerCommands;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public List<SaveQuestionAnswerCommand> getSaveQuestionAnswerCommands() {
        return saveQuestionAnswerCommands;
    }

    public void setSaveQuestionAnswerCommands(
            List<SaveQuestionAnswerCommand> saveQuestionAnswerCommands) {
        this.saveQuestionAnswerCommands = saveQuestionAnswerCommands;
    }

    @Override
    public String toString() {
        return "SaveAnswerCommand{" + "surveyId=" + surveyId + ", saveQuestionAnswerCommands="
                + saveQuestionAnswerCommands + '}';
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
        return saveQuestionAnswerCommands != null
                ? saveQuestionAnswerCommands.equals(that.saveQuestionAnswerCommands)
                : that.saveQuestionAnswerCommands == null;
    }

    @Override
    public int hashCode() {
        int result = surveyId;
        result = 31 * result
                + (saveQuestionAnswerCommands != null ? saveQuestionAnswerCommands.hashCode() : 0);
        return result;
    }
}
