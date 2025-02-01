package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @Size(min = 5,max=255)
    private String description;

    public Skill(){}

    public @Size(min = 5, max = 255) String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 5, max = 255) String description) {
        this.description = description;
    }
}
