package desmos.entity;

public abstract class Entity {
    protected String name;
    protected String password;
    protected static int aliveInstances;


   public abstract void signOut();

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public static int getAliveInstances(){
        return aliveInstances;
    }
}
