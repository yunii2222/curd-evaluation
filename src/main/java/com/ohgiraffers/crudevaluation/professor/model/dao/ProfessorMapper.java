package com.ohgiraffers.crudevaluation.professor.model.dao;

import com.ohgiraffers.crudevaluation.professor.model.dto.ProfessorDTO;
import com.ohgiraffers.crudevaluation.professor.model.dto.SubjectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfessorMapper {

    List<ProfessorDTO> findAllProfessor();

    List<SubjectDTO> findProfessorList();

    void registProfessor(ProfessorDTO professorDTO);
}
