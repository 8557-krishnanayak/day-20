package com.views;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Employee> list = List.of(
                new Employee("8559", "krishna", "Software"),
                new Employee("0700", "Azam", "Software")
        );
        req.setAttribute("list", list);
        System.out.println(list);
        req.getRequestDispatcher("/employee_view/Employee.jsp").forward(req, resp);
    }
}

class Employee {
    String empId;
    String name;
    String dept;

    public Employee(String empId, String name, String dept) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ']';
    }
}
