package com.books.recommendation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class Users {
    @Id
    private String id;
    private String name;
    private String password;

    public Users() {
    }

    public Users(String name, String password) {
        this.name = name;
        this.password =password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format(
                "User[id=%s, name='%s', password='%s']",
                id, name, password);
    }


}