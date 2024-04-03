package project.ourduty.entity;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Schedule {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String timeZone;

    public Schedule(LocalDateTime startDate, LocalDateTime endDate, String timeZone) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeZone = timeZone;
    }
}
