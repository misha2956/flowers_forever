package Users;

import java.util.concurrent.ThreadLocalRandom;

public interface User {
    int id = ThreadLocalRandom.current().nextInt(0, 2147000000);
    void update(String status);
}
