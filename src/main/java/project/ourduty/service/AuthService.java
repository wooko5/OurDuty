package project.ourduty.service;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ourduty.entity.User;
import project.ourduty.repository.UserRepository;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;
    private final HttpSession httpSession;

    public boolean login(String username, String password) {

        User user = userRepository.findUsersByUsername(username);
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
