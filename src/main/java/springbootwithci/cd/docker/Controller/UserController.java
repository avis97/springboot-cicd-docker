package springbootwithci.cd.docker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbootwithci.cd.docker.Entitys.User;
import springbootwithci.cd.docker.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController{

    @Autowired
    UserService userService;

    @PostMapping("add")
    public String addUser(@RequestBody User user){

        userService.addUser(user);
        return "Your Registration is done";
    }
    @GetMapping("get")
    public List<User> getAllUser(){

        List<User> list=userService.getAllUser();
        return list;
    }
    @GetMapping("getbyid/{id}")
    public User getUserById(@PathVariable("id") int id){

        User user=userService.getUserById(id);
        return user;
    }
    @DeleteMapping("dletebyid/{id}")
    public String deleteUserByid(@PathVariable("id") int id){

        userService.deleteUser(id);
        return "This User Delete Successfully!!";
    }
}
