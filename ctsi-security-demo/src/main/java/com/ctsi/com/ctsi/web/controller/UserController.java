package com.ctsi.com.ctsi.web.controller;

import com.ctsi.dto.User;
import com.ctsi.dto.UserQueryCondition;
import com.fasterxml.jackson.annotation.JsonView;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by llsam on 2018/5/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //@RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping()
    @JsonView(User.UserSimpleView.class)
    public List<User> query(UserQueryCondition userQueryCondition, @PageableDefault(page = 2,size = 11,sort = "password desc") Pageable pageable) {
        System.out.println(ReflectionToStringBuilder.toString(userQueryCondition,ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        List<User> userList=new ArrayList<User>();
        userList.add(new User());
        userList.add(new User());
        userList.add(new User());
        return userList;
    }
    //@RequestMapping(value = "/user/{id:\\d+}",method = RequestMethod.GET)
    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public  User getInfo(@PathVariable String id){
        User user =new User();
        user.setUserName("llsam");
        user.setPassWord("213123");
        return  user;
    }

}
