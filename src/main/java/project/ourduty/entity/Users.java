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
public class Users extends BaseEntity {

    @Id
    @Column(name = "users_id")
    @GeneratedValue
    private Long id;
    private String name;
    private String phoneNumber;
}
