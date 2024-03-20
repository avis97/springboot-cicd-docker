package springbootwithci.cd.docker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootwithci.cd.docker.Entitys.User;
import springbootwithci.cd.docker.Repository.UserRepository;

import java.util.List;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public List<User> getAllUser(){
        List<User> userList=userRepository.findAll();
        return userList;
    }
}
