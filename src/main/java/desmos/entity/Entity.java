package desmos.entity;

public abstract class Entity {
    protected String name;
    protected String password;



   public abstract void signOut();

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
