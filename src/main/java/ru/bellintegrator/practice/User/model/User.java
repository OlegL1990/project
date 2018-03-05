package ru.bellintegrator.practice.User.model;

import ru.bellintegrator.practice.Office.model.Office;
import ru.bellintegrator.practice.Ref.model.Countries;
import ru.bellintegrator.practice.Ref.model.Docs;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "firstName")
    private String firstName;

    @Basic(optional = false)
    @Column(name = "secondName")
    private String secondName;

    @Basic(optional = false)
    @Column(name = "middleName")
    private String middleName;

    @Basic(optional = false)
    @Column(name = "position")
    private String position;

    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;

    @Column(name = "isIdentified")
    private Boolean isIdentified = true;

    @Basic(optional = false)
    @Column(name = "docDate")
    @Temporal(TemporalType.DATE)
    private Date docDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "officeid")
    private Office office;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docName")
    private Docs docName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docNumber")
    private Docs docNumber ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citizenshipName")
    private Countries citizenshipName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citizenshipCode")
    private Countries citizenshipCode;

    public User(){}

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getIdentified() {
        return isIdentified;
    }

    public void setIdentified(Boolean identified) {
        isIdentified = identified;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Docs getDocName() {
        return docName;
    }

    public void setDocName(Docs docName) {
        this.docName = docName;
    }

    public Docs getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(Docs docNumber) {
        this.docNumber = docNumber;
    }

    public Countries getCitizenshipName() {
        return citizenshipName;
    }

    public void setCitizenshipName(Countries citizenshipName) {
        this.citizenshipName = citizenshipName;
    }

    public Countries getCitizenshipCode() {
        return citizenshipCode;
    }

    public void setCitizenshipCode(Countries citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
    }
}
