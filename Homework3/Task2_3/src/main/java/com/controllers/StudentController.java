package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

@Controller
public class StudentController {
    private final String FILE_PATH = "students.txt";

    @GetMapping("/")
    public String studentForm() {
        return "studentForm";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestParam("name") String name,
                              @RequestParam("age") int age,
                              Model model) throws IOException {
        String record = name + ", " + age;
        Files.write(Paths.get(FILE_PATH), (record + System.lineSeparator()).getBytes(),
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        long count = Files.lines(Paths.get(FILE_PATH)).count();

        model.addAttribute("message", "Студента успішно додано!");
        model.addAttribute("count", count);
        return "result";
    }

    @GetMapping("/showStudents")
    public String showAllStudents(Model model) throws IOException {
        List<String> students = Files.readAllLines(Paths.get(FILE_PATH));
        model.addAttribute("students", students);
        return "students";
    }
}