import Flowers.FlowerType;
import Users.User;
import db.Connection;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class Order {
    Connection connection;
    FlowerType flowerType;
    private final @Getter List<User> users = new ArrayList<>();

    public Order(FlowerType flowerType) {
        this.flowerType = flowerType;
        connection = Connection.getConnection();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        int ind = users.indexOf(user);
        if (ind != -1) {
            users.remove(ind);
        }
    }

    public void notifyUsers(String status) {
        for (User user : users) {
            user.update(status);
        }
    }

    public boolean order() {
        connection.submitStats(flowerType);
        notifyUsers("NEW_ORDER");
        return true;
    }
}
