package edu.faf.oop.RootClass;

import java.util.Random;
import java.util.UUID;

public class Root {
    protected String itemId;

    protected void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Root(String itemId)
    {
        this.itemId = itemId;
    }
    public String getItemId(){
        return this.itemId;
    }

    protected String generateId() {
        UUID id = UUID.randomUUID();

        return id.toString();
    }
    public int generateIntId() {
        Random randInt = new Random();
        return 100+ randInt.nextInt(901);
    }
}
