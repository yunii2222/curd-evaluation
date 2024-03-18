package com.ohgiraffers.crudevaluation.professor.controller;

import com.ohgiraffers.crudevaluation.professor.model.service.ProfessorService;
import com.ohgiraffers.crudevaluation.professor.model.dto.ProfessorDTO;
import com.ohgiraffers.crudevaluation.professor.model.dto.SubjectDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    /* Logger 객체 생성
     * Logger, Factory 둘다 slf4j로 선택*/
    private static final Logger logger = LoggerFactory.getLogger(ProfessorController.class);
    private final ProfessorService professorService;
    private final MessageSource messageSource;

    /* 의존성 주입하는 코드 */
    public ProfessorController(ProfessorService professorService, MessageSource messageSource){
        this.professorService = professorService;
        this.messageSource = messageSource;
    }
    @GetMapping("/list")
    public String findProfessorList(Model model){
        List<ProfessorDTO> professorList = professorService.findAllProfessor();

        model.addAttribute("professorList", professorList);

        return "professor/list";
    }

    @GetMapping("/regist")
    public void registPage(){}

    @GetMapping("/subject")
    public @ResponseBody List<SubjectDTO> findProfessorList(){

        /* service페이지에 추가 */
        return professorService.findProfessorList();
    }

    @PostMapping("/regist")
    /* @ModelAttribute를 통해 MenuDTO값을 받아온다. */
    public String registProfessor(@ModelAttribute ProfessorDTO professorDTO, RedirectAttributes rttr, Locale locale){

        /* logger 레벨 테스트 */
        logger.trace("professor : {}", professorDTO);
        logger.debug("professor : {}", professorDTO);
        logger.info("professor : {}", professorDTO);
        logger.warn("professor : {}", professorDTO);
        logger.error("professor : {}", professorDTO);

        professorService.registProfessor(professorDTO);

        rttr.addFlashAttribute("successMessage", messageSource.getMessage("registProfessor", null, locale ));

        /* 다시 요청 할 수 있다. */
        return "redirect:/professor/list";
    }
}
