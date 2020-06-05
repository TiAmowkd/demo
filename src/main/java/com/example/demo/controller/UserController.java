package com.example.demo.controller;

import com.example.demo.servive.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wkd
 * @Date: 2020/4/24 15:23
 * @Description:
 */
@RestController
@RequestMapping("/User")
@Api(value = "User-Api")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "selectAllRow")
    @PostMapping("/selectAllRow")
    public List<String> selectAllRow() {
        return userService.selectAllRow();

    }
    @ApiOperation(value = "select")
    @PostMapping("/select")
    public List<Map<String,Object>> select(@RequestParam(value = "date") @ApiParam(value = "list") List<String> date) {
        return userService.select(date);
    }

}
