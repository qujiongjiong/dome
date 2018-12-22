package cn.kgc.controller;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    //登陆
    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){
        User user=new User();
        user.setName(username);
        user.setPassword(password);
        User login = userService.login(user);
        HttpSession session= request.getSession();
        if(login!=null){
            List<User> all = userService.all();
            session.setAttribute("list",all);
            session.setAttribute("username",user.getName());
            return "main.jsp";
        }
        return "error.jsp";
    }
//删除
    @RequestMapping(value = "/del")
    public String del(@RequestParam("id") int id){
       userService.del(id);
       return "redirect:main";
    }
    @RequestMapping(value = "/main")
    public String main(HttpServletRequest request){
      List<User> all=  userService.all();
      HttpSession session=request.getSession();
      session.setAttribute("list",all);
      return "main.jsp";
    }
//增加
    @RequestMapping(value = "add")
    public String save(User user){
      if(user.getId()==null){
          userService.add(user);
      }else{
          userService.updata(user);
      }
        return "redirect:main";
    }

    //修改
    @RequestMapping(value = "/updata")
    public String updata(@RequestParam("id") int id,HttpServletRequest request){
        User userById = userService.getUserById(id);
        HttpSession session=request.getSession();
        session.setAttribute("user",userById);
        return "updata.jsp";
    }
}
