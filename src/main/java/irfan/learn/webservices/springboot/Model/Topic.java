package irfan.learn.webservices.springboot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Topic {

    @Id
    @GeneratedValue
    private Integer id;

    private String silibus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSilibus() {
        return silibus;
    }

    public void setSilibus(String silibus) {
        this.silibus = silibus;
    }

}
