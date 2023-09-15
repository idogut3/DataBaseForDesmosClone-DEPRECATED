package desmos;

public class Desmos {
    private static Desmos desmosInstance;
    private DesmosManager desmosManager;

    private Desmos() {
        DesmosManager desmosManager = null;
    }

    public static synchronized Desmos getInstance() {
        if (desmosInstance == null) {
            desmosInstance = new Desmos();
        }
        return desmosInstance;
    }

    public DesmosManager getDesmosManager() {
        return desmosManager;
    }

    public void changeManager(DesmosManager desmosManager) {
        this.desmosManager = desmosManager;
    }
    public void signIn(String name, String password){
        //TODO:
    }

}
