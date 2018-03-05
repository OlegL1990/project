package ru.bellintegrator.practice.Ref.model;

import ru.bellintegrator.practice.User.model.User;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Countries")
public class Countries {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Set<User> getUsers0() {
        return users0;
    }

    public void setUsers0(Set<User> users0) {
        this.users0 = users0;
    }

    public Set<User> getUsers1() {
        return users1;
    }

    public void setUsers1(Set<User> users1) {
        this.users1 = users1;
    }

    public Countries(){}

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Column(name = "code")
    private int code;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "citizenshipName", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<User> users0;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "citizenshipCode", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<User> users1;
}
