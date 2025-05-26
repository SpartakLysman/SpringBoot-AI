package com.firstone;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String techStack;

    @Column(columnDefinition = "TEXT")
    private String learningPathRecommendation;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, String techStack, String learningPathRecommendation) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
        this.learningPathRecommendation = learningPathRecommendation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getLearningPathRecommendation() {
        return learningPathRecommendation;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public void setLearningPathRecommendation(String learningPathRecommendation) {
        this.learningPathRecommendation = learningPathRecommendation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getTechStack(), that.getTechStack()) && Objects.equals(getLearningPathRecommendation(), that.getLearningPathRecommendation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getTechStack(), getLearningPathRecommendation());
    }
}