package project.ourduty.entity;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Schedule {
    private Date startDate;
    private Date endDate;
    private String timeZone;

    public Schedule(Date startDate, Date endDate, String timeZone) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeZone = timeZone;
    }
}
