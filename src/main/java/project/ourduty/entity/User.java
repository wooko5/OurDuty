package project.ourduty.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "users")
public class User extends BaseEntity {

    @Id
    @Column(name = "users_id")
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String username;
    private String phoneNumber;

    public User(String email, String password, String username, String phoneNumber) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.phoneNumber = phoneNumber;
    }
}
