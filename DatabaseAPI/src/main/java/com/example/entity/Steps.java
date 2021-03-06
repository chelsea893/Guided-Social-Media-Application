package com.example.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "step")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true, ignoreUnknown = true)
public class Steps {
    @javax.persistence.Id
    @GeneratedValue
    private UUID uuid;

    @JsonProperty(value = "step")
    private int step;

    @JsonProperty(value = "buttonName")
    private String buttonName;

    @JsonProperty(value = "instruction")
    private String instruction;

    // Accessor
    public int getStep() {
        return step;
    }

    public String getButtonName() {
        return buttonName;
    }

    public String getInstruction() {
        return instruction;
    }

    //Modifier
    public void setStep(int step) {
        this.step = step;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}