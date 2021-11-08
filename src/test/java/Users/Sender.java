package Users;

public class Sender implements User {
    String name;
    public Sender(String name) {
        this.name = name;
    }
    @Override
    public void update(String status) {
        System.out.println(name + " received status " + status);
    }
}
