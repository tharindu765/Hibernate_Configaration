package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lk.ijse.embed.FullName;
@Entity
public class Teacher {
    @Id
    private int Id;
    private FullName name;
    private String address;


    public Teacher() {
        Id = Id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
