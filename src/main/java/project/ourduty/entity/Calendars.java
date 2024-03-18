package project.ourduty.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Calendars extends BaseEntity{
    @Id
    @Column(name = "calendar_id")
    @GeneratedValue
    private Long id;
    private String status;
    private String description;
    private String location;
    private String color;
    @Embedded
    private Schedules schedules;
}
