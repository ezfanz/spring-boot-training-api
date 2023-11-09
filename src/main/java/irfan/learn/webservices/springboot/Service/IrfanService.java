package irfan.learn.webservices.springboot.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import irfan.learn.webservices.springboot.Model.Irfan;
import irfan.learn.webservices.springboot.Model.User;

@Component
public class IrfanService {

    private static List<Irfan> irfans = new ArrayList<>();

      static {
        irfans.add(new Irfan(1, "Adam", LocalDate.now().minusYears(30), 10));
        irfans.add(new Irfan(1, "Hawa", LocalDate.now().minusYears(30), 15));
        irfans.add(new Irfan(1, "Amri", LocalDate.now().minusYears(30), 15));

    }

    public List<Irfan> findAll() {
        return irfans;
    }
    
}
