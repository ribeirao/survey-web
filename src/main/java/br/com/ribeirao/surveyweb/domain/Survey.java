package br.com.ribeirao.surveyweb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private boolean active;

    @Column
    private Date creationDate;

    @Column
    private Date updateDate;

    @Column
    private Date closeDate;

    @OneToMany(mappedBy = "survey")
    private List<Question> questions;

    private Survey() {
    }

    public Survey(String name) {
        this.name = name;
        this.active = false;
        this.creationDate = new Date();
        this.updateDate = new Date();
        this.closeDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Survey{" + "id=" + id + ", name='" + name + '\'' + ", active=" + active
                + ", creationDate=" + creationDate + ", updateDate=" + updateDate + ", closeDate="
                + closeDate + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Survey survey = (Survey) o;

        if (active != survey.active)
            return false;
        if (id != null ? !id.equals(survey.id) : survey.id != null)
            return false;
        if (name != null ? !name.equals(survey.name) : survey.name != null)
            return false;
        if (creationDate != null ? !creationDate.equals(survey.creationDate)
                : survey.creationDate != null)
            return false;
        if (updateDate != null ? !updateDate.equals(survey.updateDate) : survey.updateDate != null)
            return false;
        return closeDate != null ? closeDate.equals(survey.closeDate) : survey.closeDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (closeDate != null ? closeDate.hashCode() : 0);
        return result;
    }
}
