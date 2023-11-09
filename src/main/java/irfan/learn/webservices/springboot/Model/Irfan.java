package irfan.learn.webservices.springboot.Model;

import java.time.LocalDate;

public class Irfan {
    private Integer id;
    private String nama;
    private LocalDate birthDate;
    private Integer age;

    public Irfan(Integer id, String nama, LocalDate birthDate, Integer age) {
        this.id = id;
        this.nama = nama;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Irfan [id=" + id + ", nama=" + nama + ", birthDate=" + birthDate + ", age=" + age + "]";
    }

    

    


}
