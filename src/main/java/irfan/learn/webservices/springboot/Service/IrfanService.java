package irfan.learn.webservices.springboot.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import irfan.learn.webservices.springboot.Model.Irfan;
import irfan.learn.webservices.springboot.Model.User;

@Component
public class IrfanService {

    private static List<Irfan> irfans = new ArrayList<>();

    private static int usersCount = 0;

      static {
          irfans.add(new Irfan(usersCount++, "Adam", LocalDate.now().minusYears(30), 10));
          irfans.add(new Irfan(usersCount++, "Hawa", LocalDate.now().minusYears(30), 15));
          irfans.add(new Irfan(usersCount++, "Amri", LocalDate.now().minusYears(30), 15));

    }

    public List<Irfan> findAll() {
        return irfans;
    }

    public Irfan findOne(int id) {
        Predicate<? super Irfan> predicate = irfans -> irfans.getId().equals(id);
        return irfans.stream().filter(predicate).findFirst().orElse(null);
    }
    
}
