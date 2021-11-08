import Flowers.FlowerType;
import Users.Receiver;
import Users.Sender;
import db.Connection;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Receiver receiver1 = new Receiver("Store1");
        Receiver receiver2 = new Receiver("Store2");

        Order order = new Order(FlowerType.CHAMOMILE);
        Sender sender = new Sender("Vasiliy");
        order.addUser(sender);
        order.addUser(receiver1);
        order.addUser(receiver2);

        order.order();

        Connection connection = Connection.getConnection();
        for (Map.Entry<FlowerType, Integer> flowerType : connection.getFlowerTypeStats().entrySet()) {
            System.out.println("Number of " + flowerType.getKey().name() + " bought: " + flowerType.getValue());
        }
    }
}
