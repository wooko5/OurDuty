package project.ourduty.service;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ourduty.entity.Users;
import project.ourduty.repository.UsersRepository;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UsersRepository usersRepository;
    private final HttpSession httpSession;

    public boolean login(String username, String password) {

        Users user = usersRepository.findUsersByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            httpSession.setAttribute("loggedInUser", user);
            return true;
        }

        return false;
    }

    public void logout() {
        httpSession.removeAttribute("loggedInUser");
    }
}
