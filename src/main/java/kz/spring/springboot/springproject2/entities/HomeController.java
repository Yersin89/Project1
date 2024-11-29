package kz.spring.springboot.springproject2.entities;

import kz.spring.springboot.springproject2.controllers.Student;
import kz.spring.springboot.springproject2.db.DbManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String homePage(Model model) {
        model.addAttribute("students", DbManager.getStudents());
        return "index";
    }
    @GetMapping(value = "/add")
    public String addStudentPage() {
        return "addStudent";
    }
    @PostMapping(value = "/add")
    public String addStudent(@RequestParam String name, @RequestParam String surName, @RequestParam Integer exam) {
        Student student = new Student();
        student.setName(name);
        student.setSurName(surName);
        student.setExam(exam);
        DbManager.addStudent(student);
        return "redirect:/";
    }
}



