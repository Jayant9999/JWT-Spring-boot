package com.project.userQuery.controller;

import com.project.attendance.dto.Student_Attendance;
import com.project.userQuery.dto.QueryDto;
import com.project.userQuery.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class QueryController {

    @Autowired
    QueryService qs;


    @PostMapping(value = "insertQuery")
    public QueryDto add(@RequestBody QueryDto qd){
        return qs.insertQuery(qd);

    }

    @GetMapping(value="viewQueries")
    public List<QueryDto> list(){
        return qs.getQueries();
    }



}
