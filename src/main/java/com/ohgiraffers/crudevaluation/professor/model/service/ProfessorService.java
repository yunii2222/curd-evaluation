package com.ohgiraffers.crudevaluation.professor.model.service;
import com.ohgiraffers.crudevaluation.professor.model.dao.ProfessorMapper;
import com.ohgiraffers.crudevaluation.professor.model.dto.ProfessorDTO;
import com.ohgiraffers.crudevaluation.professor.model.dto.SubjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorMapper professorMapper;

    public ProfessorService(ProfessorMapper professorMapper){
        this.professorMapper = professorMapper;
    }
    public List<ProfessorDTO> findAllProfessor() {
        return professorMapper.findAllProfessor();
    }

    public List<SubjectDTO> findProfessorList() {
        return professorMapper.findProfessorList();
    }

    public void registProfessor(ProfessorDTO professorDTO) {
        professorMapper.registProfessor(professorDTO);
    }

    /* commit */
}
