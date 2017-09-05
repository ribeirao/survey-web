package br.com.ribeirao.surveyweb.application;


import java.util.Arrays;

public class FindQuestionsCommand {

    private Integer[] questions;

    public FindQuestionsCommand () {

    }

    public Integer[] getQuestions() {
        return questions;
    }

    public void setQuestions(Integer[] questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FindQuestionsCommand that = (FindQuestionsCommand) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(questions, that.questions);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(questions);
    }

    public FindQuestionsCommand(Integer ...questions) {

        this.questions = questions;
    }

    @Override
    public String toString() {
        return "FindQuestionsCommand{" +
                "questions=" + Arrays.toString(questions) +
                '}';
    }


}
