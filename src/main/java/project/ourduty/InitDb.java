package project.ourduty;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import project.ourduty.entity.Users;

@Component
@RequiredArgsConstructor
public class InitDb {
    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbUsersInit();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    private static class InitService {

        private final EntityManager entityManager;

        public void dbUsersInit() {
            Users userA = new Users("ohju@asianaidt.com", "1234", "ohju", "01012344566");
            entityManager.persist(userA);
            Users userB = new Users("youyk@asianaidt.com", "1234", "youyk", "01031243566");
            entityManager.persist(userB);
            Users userC = new Users("limsh@asianaidt.com", "1234", "limsh", "01099998888");
            entityManager.persist(userC);
        }
    }
}
