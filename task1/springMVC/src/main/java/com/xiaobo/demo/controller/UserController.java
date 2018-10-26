package com.xiaobo.demo.controller;


import com.xiaobo.demo.entity.User;
import com.xiaobo.demo.service.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView userListPage() {
        List<User> userList = userService.getAll();
        return new ModelAndView("userList","userListData",userList);
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView userAddPage() {
        return new ModelAndView("userAdd");
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView userEditPage(@PathVariable("id") Integer id) {
        User user = userService.getUserById(id);
        return new ModelAndView("userEdit","userInfoData",user);
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String userUpdatePage(@PathVariable("id") Integer id, @RequestParam("name") String name, @RequestParam("sex") String sex, @RequestParam("phone") String phone) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSex(sex);
        user.setPhone(phone);
        userService.updateUser(user);
        return "redirect:/user/list";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String userDeletePage(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/user/list";
    }
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String userAddUserPage(@RequestParam("name") String name, @RequestParam("sex") String sex, @RequestParam("phone") String phone) {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        user.setPhone(phone);
        userService.addUser(user);
        return "redirect:/user/list";
    }
}
