package br.com.ribeirao.surveyweb.application;

public class SaveQuestionAnswerCommand {

    private int questionId;
    private String answer;

    private SaveQuestionAnswerCommand() {}

    public SaveQuestionAnswerCommand(int questionId, String answer) {
        this.questionId = questionId;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "SaveQuestionAnswerCommand{" + "questionId=" + questionId + ", answer=" + answer
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SaveQuestionAnswerCommand that = (SaveQuestionAnswerCommand) o;

        if (questionId != that.questionId)
            return false;
        return answer != null ? answer.equals(that.answer) : that.answer == null;
    }

    @Override
    public int hashCode() {
        int result = questionId;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }
}
