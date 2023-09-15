package desmos;

public class Admin extends Entity implements IAbleToDrawFunction {
    public static int aliveInstances = 0;

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
        aliveInstances += 1;
    }

    public void deleteUser(User user, DataBaseTable dataBaseTable) {
        // Todo:
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
