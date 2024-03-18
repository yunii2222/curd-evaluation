package com.ohgiraffers.crudevaluation.professor.model.dto;

public class ProfessorDTO {
    private int professorCode;
    private String professorName;
    private String professorPhone;
    private int subjectCode;

    public ProfessorDTO() {
    }

    public ProfessorDTO(int professorCode, String professorName, String professorPhone, int subjectCode) {
        this.professorCode = professorCode;
        this.professorName = professorName;
        this.professorPhone = professorPhone;
        this.subjectCode = subjectCode;
    }

    public int getProfessorCode() {
        return professorCode;
    }

    public void setProfessorCode(int professorCode) {
        this.professorCode = professorCode;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorPhone() {
        return professorPhone;
    }

    public void setProfessorPhone(String professorPhone) {
        this.professorPhone = professorPhone;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "professorCode=" + professorCode +
                ", professorName='" + professorName + '\'' +
                ", professorPhone='" + professorPhone + '\'' +
                ", subjectCode=" + subjectCode +
                '}';
    }
}
