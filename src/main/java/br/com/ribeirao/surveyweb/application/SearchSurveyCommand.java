package br.com.ribeirao.surveyweb.application;


import java.util.Arrays;

public class SearchSurveyCommand {

    private Integer[] questions;

    public SearchSurveyCommand() {

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

        SearchSurveyCommand that = (SearchSurveyCommand) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(questions, that.questions);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(questions);
    }

    public SearchSurveyCommand(Integer ...questions) {

        this.questions = questions;
    }

    @Override
    public String toString() {
        return "SearchSurveyCommand{" +
                "questions=" + Arrays.toString(questions) +
                '}';
    }


}
