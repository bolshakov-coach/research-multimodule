package pro.bolshakov.firstapp.beans;

import java.util.UUID;

public class InternalAppBean {

    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "InternalAppBean{" +
                "id='" + id + '\'' +
                '}';
    }
}
