package a_Dzien_1.model;

import a_Dzien_1.model.Group;
import a_Dzien_1.model.Model;

public class User implements Model {
    private Long id;
    private String username;
    private Long usergroup;

    public User(String username, Long usergroup) {
        this.id = null;
        this.username = username;
        this.usergroup = usergroup;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(Group usergroup) {
        this.usergroup = usergroup.getId();
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id= " + this.id + ", name= " + this.username + ", group id= " + this.usergroup;
    }
}
