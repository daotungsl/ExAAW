package demo.Home;

import demo.Home.HomeService;
import demo.User;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class HomeView {
    private List<User> workSchedule;
    private List<User> particular;

        private User selectedUser;

        @ManagedProperty("#{homeService}")
        private HomeService service;

        @PostConstruct
        public void init() {
            workSchedule = service.getHome();
            particular = service.getHome();
        }

        public List<User> getWorkSchedule() {
            return workSchedule;
        }
    public List<User> getParticular() {
        return particular;
    }


        public void setService(HomeService service) {
            this.service = service;
        }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }
}

