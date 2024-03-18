package com.ohgiraffers.crudevaluation.professor.model.dto;

import lombok.*;
public class SubjectDTO {
    private int subjectCode;
    private String subjectName;
    private int collegeCode;

    public SubjectDTO() {

    }
    public SubjectDTO(int subjectCode, String subjectName, int collegeCode) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.collegeCode = collegeCode;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(int collegeCode) {
        this.collegeCode = collegeCode;
    }

    @Override
    public String toString() {
        return "SubjectDTO{" +
                "subjectCode=" + subjectCode +
                ", subjectName='" + subjectName + '\'' +
                ", collegeCode=" + collegeCode +
                '}';
    }
}
