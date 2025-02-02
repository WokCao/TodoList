package com.example.TodoList.Models.UserModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    private @Id
    @GeneratedValue Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "password")
    @JsonIgnore()
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(nullable = false)
    private boolean activated;
    @Column(name = "activation_token")
    private String activationToken;
    @Column(name = "google_account", nullable = false)
    private boolean googleAccount;
    public User() {}
    public User(String fullName, String password, String phoneNumber, String email, String gender, boolean googleAccount) {
        this.fullName = fullName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.activated = false;
        this.googleAccount = googleAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getActivationToken() {
        return activationToken;
    }

    public void setActivationToken(String activationToken) {
        this.activationToken = activationToken;
    }

    public boolean isGoogleAccount() {
        return googleAccount;
    }

    public void setGoogleAccount(boolean googleAccount) {
        this.googleAccount = googleAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
