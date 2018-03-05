package ru.bellintegrator.practice.Ref.model;

import ru.bellintegrator.practice.User.model.User;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Docs")
public class Docs {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Column(name = "code")
    private int code;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "docName", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<User> users0;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "docNumber", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<User> users1;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public Docs(){}
}
