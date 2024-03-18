package project.ourduty.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class) //해당 어노테이션이 있어야 데이터의 변경(C/U/D) 시 이벤트(@PreUpdated...)를 발생
@Getter
@MappedSuperclass
public class BaseEntity extends BaseTimeEntity{
    @CreatedBy
    @Column(updatable = false)
    String createdBy; //등록자

    @LastModifiedBy
    String lastModifiedBy; //수정자
}
