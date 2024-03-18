package project.ourduty.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class) //해당 어노테이션이 있어야 데이터의 변경(C/U/D) 시 이벤트(@PreUpdated...)를 발생
@Getter
@MappedSuperclass
public class BaseTimeEntity {
    @CreatedDate
    @Column(updatable = false)
    LocalDateTime createdDate;

    @LastModifiedDate
    LocalDateTime lastModifiedDate;
}
