package com.hexawareZA.JPA2.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Mobile")
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Mobile_Company")
    private String company;

    @Column(name = "Mobile_Name")
    private String mobileName;

    @OneToMany(mappedBy = "course")
    private List<App> apps = new ArrayList<>();

    public Mobile() {
    }

    public Mobile(String company, String mobileName) {
        this.company = company;
        this.mobileName = mobileName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public List<App> getApps() {
        return apps;
    }

    public void addApp(App app) {
        this.apps.add(app);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", mobileName='" + mobileName + '\'' +
                '}';
    }
}
