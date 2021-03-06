package br.com.ribeirao.surveyweb.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ribeirao.surveyweb.application.SaveAnswerCommand;
import br.com.ribeirao.surveyweb.application.survey.QuestionForm;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public Survey retrieveActiveSurvey() {
        return surveyRepository.findOneByActive(true);
    }

    public Survey saveSurvey(String name) {
        Survey survey = new Survey(name);

        return surveyRepository.save(survey);
    }

    public List<Survey> retrieveAllSurveys() {
        return surveyRepository.findAll();
    }

    public Survey saveQuestion(QuestionForm form) {
        Survey survey = surveyRepository.findOne(form.getSurveyId());

        Question question = new Question(survey, form.getAnimation(), form.getStatement(),
                form.getOptionA(), form.getAnimationA(), form.getOptionB(), form.getAnimationB(),
                form.getOptionC(), form.getAnimationC(), form.getOptionD(), form.getAnimationD(),
                form.getOptionE(), form.getAnimationE(), form.getCorrectAnswer());

        survey.getQuestions().add(question);

        return surveyRepository.save(survey);
    }

    public boolean saveAnswer(SaveAnswerCommand command) {
        Answer answer = new Answer(command.getSurveyId(), constructQuestionAnswerList(command),
                command.getName());

        answerRepository.save(answer);
        return true;
    }

    public List<Answer> retrieveAnswerBySurveyId(int surveyId) {
        return answerRepository.findAllBySurveyId(surveyId);
    }

    private List<QuestionAnswer> constructQuestionAnswerList(SaveAnswerCommand command) {
        List<QuestionAnswer> list = new ArrayList<>();
        command.getQuestionAnswers().stream().forEach(
                qa -> list.add(new QuestionAnswer(questionRepository.findOne(qa.getQuestionId()),
                        qa.getAnswer())));

        return list;
    }

    public void changeStatus(Integer surveyId) {
        Survey survey = surveyRepository.findOne(surveyId);

        if (survey.isActive()) {
            deactiveStatus(survey);
        } else {
            activeStatus(survey);
        }
    }

    private void activeStatus(Survey survey) {
        survey.setActive(Boolean.TRUE);

        surveyRepository.save(survey);

        List<Survey> surveys = surveyRepository.findAll();
        surveys.stream().filter(surveyDeactive -> !surveyDeactive.equals(survey))
                .forEach(surveyDeactive -> deactiveStatus(surveyDeactive));
    }

    private void deactiveStatus(Survey survey) {
        survey.setActive(Boolean.FALSE);
        surveyRepository.save(survey);
    }
}
