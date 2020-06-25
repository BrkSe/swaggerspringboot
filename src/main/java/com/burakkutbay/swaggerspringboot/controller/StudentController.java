package com.burakkutbay.swaggerspringboot.controller;

import com.burakkutbay.swaggerspringboot.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasanburakkutbay on 25.06.2020.
 */
@RestController
@RequestMapping("/api")
@Api(value = "Student Rest Api", description = "Student Rest Service")
public class StudentController {
    @ApiResponses(
            value={
                    @ApiResponse(code = 403, message = "Forbidden"),
                    @ApiResponse(code = 404, message = "Not found"),
                    @ApiResponse(code = 500, message = "Server error")
            }
    )

    @ApiOperation(value = "List of Student"  )
    @GetMapping({"/", "/students"})
    public List<Student> getStudentList() {

        Map<Integer, Student> studentList = studentDatabase();

        return new ArrayList<>(studentList.values());
    }

    @ApiOperation(value = "Display selected Student")
    @GetMapping({"/students/{studentId}"})
    public Student getStudent(@PathVariable Integer studentId) {

        return studentDatabase().get(studentId);
    }



    private Map<Integer, Student> studentDatabase() {

        Map<Integer, Student> studentList = new HashMap<>();
        studentList.put(1, new Student(1, 1234, "Burak","Kutbay"));
        studentList.put(2, new Student(2, 5678, "Veli", "Ali"));

        return studentList;
    }
}
