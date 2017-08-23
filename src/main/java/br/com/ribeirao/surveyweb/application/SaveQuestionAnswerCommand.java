package br.com.ribeirao.surveyweb.application;

public class SaveQuestionAnswerCommand {

    private int questionId;
    private int answer;

    private SaveQuestionAnswerCommand() {}

    public SaveQuestionAnswerCommand(int questionId, int answer) {
        this.questionId = questionId;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
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
        return answer == that.answer;
    }

    @Override
    public int hashCode() {
        int result = questionId;
        result = 31 * result + answer;
        return result;
    }
}
