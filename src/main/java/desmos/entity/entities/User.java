package desmos.entity.entities;

import desmos.entity.Entity;
import desmos.entity.utilities_interfaces.IAbleToDrawFunction;

public class User extends Entity implements IAbleToDrawFunction {
    protected static int aliveInstances = 0;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        aliveInstances += 1;
    }

    @Override
    public void signOut() {
        //Todo:
    }

    @Override
    public void drawFunction(String function) {
        // Todo:
    }
}
