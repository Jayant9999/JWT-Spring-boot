package com.project.UserData_Login.controller;
import com.project.Student_details.StudentsService.StudentService;
import com.project.UserData_Login.dto.USerDataComplete;
import com.project.UserData_Login.dto.UserData;
import com.project.UserData_Login.userService.userService;
import com.project.faculty.facultyService.facultyService;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.jooq.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class userController {
    @Autowired
    private userService UserService;
    @Autowired
    private StudentService sr;
    @Autowired
    private facultyService fs;
    @PostMapping(value = "user_reg")
    public void userReg(@RequestBody USerDataComplete udc) throws MessagingException {
        UserService.addUserSep(udc);

    }
    @PostMapping(value = "login")
    public UserData login(@RequestBody UserData userdata){
        userdata=UserService.UserLogin(userdata);
        System.out.println(userdata);
        return  userdata;
    }
    @PostMapping(value="approval")
    public void approved(@RequestBody List<UserData> ud){
        UserService.aprove(ud);
    }

    @GetMapping(value="userList")
    public List<UserData> uList(){
        return UserService.getAll();
    }


    @PostMapping(value="forget")
    public int fP(@RequestBody UserData userdata){
       int res;
        res =UserService.forget(userdata);
        System.out.println(res);
        return  res;
    }




}
