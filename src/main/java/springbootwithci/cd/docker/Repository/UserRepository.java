package springbootwithci.cd.docker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springbootwithci.cd.docker.Entitys.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
