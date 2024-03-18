package com.ohgiraffers.crudevaluation.professor.controller;

import com.ohgiraffers.crudevaluation.configuration.CrudEvaluationApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@SpringBootTest
@ContextConfiguration(classes = { CrudEvaluationApplication.class })
public class ProfessorControllerTests {
    @Autowired
    private ProfessorController professorController;
    private MockMvc mockMvc;

    /* 각각 테스트가 진행되기 전 마다 mockMvc객체를 만들어준다. */
    @BeforeEach
    public void setUp(){
        /* MockMvc => 요청이 일어나는 것 처럼 해주는 */
        mockMvc = MockMvcBuilders.standaloneSetup(professorController).build();
    }

    @Test
    public void 전체_교수_조회용_컨트롤러_테스트() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/professor/list"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.forwardedUrl("professor/list"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void 신규_교수_등록용_컨트롤러_테스트() throws Exception {
        // given
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("professorName", "컨트롤러 테스트");
        params.add("professorPhone", "010-888");
        params.add("subjectCode", "5");

        mockMvc.perform(MockMvcRequestBuilders.post("/professor/regist").params(params));
    }
}
