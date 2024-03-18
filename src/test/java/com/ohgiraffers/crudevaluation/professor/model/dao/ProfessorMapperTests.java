package com.ohgiraffers.crudevaluation.professor.model.dao;

import com.ohgiraffers.crudevaluation.configuration.CrudEvaluationApplication;
import com.ohgiraffers.crudevaluation.professor.model.dto.ProfessorDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {CrudEvaluationApplication.class})
public class ProfessorMapperTests {
    @Autowired
    private ProfessorMapper professorMapper;
    @Test
    public void 매퍼_인터페이스_의존성_주입_테스트(){
        assertNotNull(professorMapper);
    }

    @Test
    public void 전체_교수_조회_매퍼_테스트(){
        // given => 세팅값
        // when => 테스트가 이렇게 실행이 된다.
        List<ProfessorDTO> professorList = professorMapper.findAllProfessor();
        // then => 질 반환 되었는지
        assertNotNull(professorList);
    }

    @Test
    @DisplayName("신규 교수가 잘 추가 되는지 매퍼 인터페이스의 메소드 확인")
    @Transactional // => 테스트 코드로 수행한 작업을 테스트 완료 후 rollback 하여 DB에 남기지 않음
    public void testRegistProfessor(){
        // given
        ProfessorDTO professor = new ProfessorDTO();
        professor.setProfessorName("테스트 성공");
        professor.setProfessorPhone("010-444");
        professor.setSubjectCode(20);

        // when & then
        assertDoesNotThrow(() -> professorMapper.registProfessor(professor));
    }

    @Test
    @DisplayName("신규 교수 추가 실패 테스트")
    public void testRegistProfessor2(){
        // given
        ProfessorDTO professor = new ProfessorDTO();
        professor.setProfessorName("테스트 실패");
        professor.setProfessorPhone("010-444");
        professor.setSubjectCode(20);

        // when & then
        assertThrows(Exception.class,() -> professorMapper.registProfessor(professor));
    }
}
