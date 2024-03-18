package com.ohgiraffers.crudevaluation.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/* 실행 클래스의 위치가 기본 패키지에서 벗어나게 되면 ComponentScan의 영역이 달라지므로 명시할 필요가 생긴다. */
@ComponentScan(basePackages = "com.ohgiraffers.crudevaluation")
/* 실행 클래스의 위치가 기본 패키지에 있으면 생략가능 */
@MapperScan(basePackages = "com.ohgiraffers.crudevaluation", annotationClass = Mapper.class)
public class CrudEvaluationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudEvaluationApplication.class, args);
    }

}
