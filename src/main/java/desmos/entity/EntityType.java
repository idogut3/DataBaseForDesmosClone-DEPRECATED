package desmos.entity;

import desmos.entity.entities.Admin;
import desmos.entity.entities.User;

public enum EntityType {
    ADMIN {
        public int countAliveInstances() { return Admin.getAliveInstances(); }
    },
    USER {
        public int countAliveInstances() { return User.getAliveInstances(); }
    };

    public abstract int countAliveInstances();
}
