package com.nestdigital.TodoFullStack.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "signup")
public class UserModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int age;
    private BigInteger mobno;
    private String gender;
    private int pincode;
    private String parent_name;
    private String password;

    public UserModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigInteger getMobno() {
        return mobno;
    }

    public void setMobno(BigInteger mobno) {
        this.mobno = mobno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel(int id, String name, String email, int age, BigInteger mobno, String gender, int pincode, String parent_name, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobno = mobno;
        this.gender = gender;
        this.pincode = pincode;
        this.parent_name = parent_name;
        this.password = password;
    }
}
