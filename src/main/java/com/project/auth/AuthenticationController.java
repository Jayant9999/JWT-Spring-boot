package com.project.auth;

import com.project.UserData_Login.dto.UserData;
import com.project.UserData_Login.userService.userService;
import com.project.security.JWT.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private userService userService;

    @PostMapping(value = "/login")
    public ApiResponse<AuthToken> register(@RequestBody UserData loginUser) throws AuthenticationException {


        final UserData user = userService.findOne(loginUser.getEmail_id());
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserId(), loginUser.getPassword()));
        final String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success",new AuthToken(token, user.getUserId()), user);
    }

    @GetMapping(value = "/validate")
    public void  validateSession() {
    }

    @GetMapping(value="/logout")
    public void logout() {
        // No way to clear JWT from server. Option => Blacklist
        SecurityContextHolder.clearContext();
    }

}