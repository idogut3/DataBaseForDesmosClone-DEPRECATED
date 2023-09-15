package desmos.entity.entities;

import desmos.program.DataBaseTable;
import desmos.entity.Entity;
import desmos.entity.utilities_interfaces.IAbleToDrawFunction;

public class Admin extends Entity implements IAbleToDrawFunction {
    protected static int aliveInstances = 0;

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
        aliveInstances += 1;
    }

    public void deleteUser(User user, DataBaseTable dataBaseTable) {
        dataBaseTable.deleteEntity(user);
    }

    @Override
    public void drawFunction(String function) {
        //Todo:
    }


    @Override
    public void signOut() {
        // Todo:
    }


}
