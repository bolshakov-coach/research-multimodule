package pro.bolshakov.common.beans;

import java.util.UUID;

public class SomeBean {

    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "id='" + id + '\'' +
                '}';
    }
}
