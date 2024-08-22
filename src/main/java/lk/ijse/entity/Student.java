package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lk.ijse.embed.FullName;

//@Entity(name = "shit")
//@Table(name = "Student")
@Entity
public class Student {
    @Id
    private int id;
    private FullName name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Student() {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}