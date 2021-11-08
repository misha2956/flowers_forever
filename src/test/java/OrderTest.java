import Flowers.FlowerType;
import Users.Sender;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        order = new Order(FlowerType.CHAMOMILE);
    }

    @org.junit.jupiter.api.Test
    void addUser() {
        Sender sender = new Sender("Vasiliy");
        order.addUser(sender);
        assertNotEquals(order.getUsers().indexOf(sender), -1);
    }

    @org.junit.jupiter.api.Test
    void removeUser() {
        Sender sender = new Sender("Vasiliy");
        order.addUser(sender);
        order.removeUser(sender);
        assertEquals(order.getUsers().indexOf(sender), -1);
    }

    @org.junit.jupiter.api.Test
    void order() {
        assertTrue(order.order());
    }
}