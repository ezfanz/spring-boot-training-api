package irfan.learn.webservices.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import irfan.learn.webservices.springboot.Model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
