package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    @Size(min = 5,max=255)
    private String description;

    public Skill(){}

    public Skill(List<Job> jobs, String description) {
        this.jobs = jobs;
        this.description = description;
    }

    public @Size(min = 5, max = 255) String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 5, max = 255) String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
