package desmos.program;

import desmos.entity.Entity;
import desmos.entity.EntityType;

public class DesmosManager {
    DataBaseTable dataTable;

    public DesmosManager(DataBaseTable dataBaseTable){
        this.dataTable = dataBaseTable;
    }

    public void makeAdmin(Entity entity){
        dataTable.makeAdmin(entity);
    }

    public void deleteEntity(Entity entity){
        dataTable.deleteEntity(entity);
    }
    public void countEntitiesByType(EntityType entityType){
        countEntitiesByType(entityType);
    }
    public int countTotalEntities(){
        return dataTable.countTotalEntities();
    }
    public void printTable(){
        dataTable.printTable();
    }


}
