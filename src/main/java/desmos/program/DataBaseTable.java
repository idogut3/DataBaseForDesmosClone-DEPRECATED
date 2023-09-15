package desmos.program;

import desmos.entity.entities.Admin;
import desmos.entity.Entity;
import desmos.entity.EntityType;

import java.util.ArrayList;

public class DataBaseTable {
    private ArrayList<Entity> entities;

    public DataBaseTable() {
        ArrayList<Entity> entities = new ArrayList<>();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public void deleteEntity(Entity entity) {
        entities.remove(entity);
    }

    public void makeAdmin(Entity entity) {
        //Getting entity details and creating an admin with those details
        String name = entity.getName();
        String password = entity.getPassword();
        Admin admin = new Admin(name, password);
        //Deleting the current old version of the entity from the dataTable
        deleteEntity(entity);
        //Adding the new version of the entity (as an admin) to the dataTable
        addEntity(admin);
    }

    public void countEntitiesByType(EntityType entityType) {
        entityType.countAliveInstances();
    }

    public int countTotalEntities() {
        return entities.size();
    }

    public void printTable() {
        //Todo:
    }
}
