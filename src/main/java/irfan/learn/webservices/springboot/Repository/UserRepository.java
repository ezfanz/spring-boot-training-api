package irfan.learn.webservices.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import irfan.learn.webservices.springboot.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
