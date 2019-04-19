package com.example.controller;

import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Controller
public class MainController {
    private ArrayList<Employee> employees = new ArrayList<>();

    @GetMapping(value = "/")
    public String home(HttpServletRequest request) {
        request.setAttribute("msg", "helo java");
        return "index";
    }

    @GetMapping(value = "/employees")
    public String employees(HttpServletRequest request, HttpServletResponse response, Model model) {
        // employees.add(new Employee(employees.size() + 1, "long",    3));
//        request.setAttribute("employees," ,employees);
        model.addAttribute("employees", employees);
        return "employees";
    }

    @PostMapping(value = "/employees")
    public String addEmployees(HttpServletRequest request, HttpServletResponse response, Model model,
                               @RequestParam(name = "name", required = true) String name,
                               @RequestParam(name = "age", required = true) int age
    ) {
        employees.add(new Employee(employees.size() + 1, name, age));
        return "redirect:/employees";
    }

    zxvfdghjghfdsgnmhgfsdafshm
}
