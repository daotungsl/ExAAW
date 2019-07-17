package demo.Home;

import demo.ConnectionHelper;
import demo.User;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@ManagedBean(name = "homeService")
@ApplicationScoped
public class HomeService {
ConnectionHelper connec = new ConnectionHelper();
    public List<User> getHome() {
        List<User> list = new ArrayList<>();

//        for(int i = 0 ; i < size ; i++) {
//            list.add(new User();
//        }

        return list;
    }


}
