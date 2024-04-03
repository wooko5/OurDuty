package project.ourduty;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import project.ourduty.entity.Employee;
import project.ourduty.entity.User;

@Component
@RequiredArgsConstructor
public class InitDb {
    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbUsersInit();
        initService.dbEmployeesInit();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    private static class InitService {

        private final EntityManager entityManager;

        public void dbUsersInit() {
            User userA = new User("ohju@asianaidt.com", "1234", "ohju", "01012344566");
            entityManager.persist(userA);
            User userB = new User("youyk@asianaidt.com", "1234", "youyk", "01031243566");
            entityManager.persist(userB);
            User userC = new User("limhs@asianaidt.com", "1234", "limhs", "01099998888");
            entityManager.persist(userC);
        }

        public void dbEmployeesInit() {
            Employee employeeA = new Employee("MinYoung", "Spine Neurosurgery", "Nurse", true, "01012345678");
            entityManager.persist(employeeA);
            Employee employeeB = new Employee("JeongMin", "Infectious Diseases", "Nurse", true, "01011217894");
            entityManager.persist(employeeB);
            Employee employeeC = new Employee("NaHyun", "Thoracic Surgery", "Nurse", true, "01078431254");
            entityManager.persist(employeeC);
            Employee employeeD = new Employee("Jaeuk", "IT", "Developer", false, "01012344566");
            entityManager.persist(employeeD);
        }
    }
}
