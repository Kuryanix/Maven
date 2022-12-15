package com.example.maven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWorld() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String information() {
        return "Имя ученика: " + "Курьян Максим" + ", "
                + "Название проекта: "+"Maven"+", "
                + "Дата создания проекта: "+"15.12.2022"+", "
                + "Описание проекта: "+"тренировка работы c Maven";
    }

}
