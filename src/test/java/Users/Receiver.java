package Users;

public class Receiver implements User {
    String name;
    public Receiver(String name) {
        this.name = name;
    }
    @Override
    public void update(String status) {
        System.out.println(name + " received status " + status);
    }
}