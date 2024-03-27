package project.ourduty.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.ourduty.service.AuthService;

@RequiredArgsConstructor
@Controller
public class LoginController {

    private final AuthService authService;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        RedirectAttributes redirectAttributes) {
        boolean isAuthenticated = authService.login(username, password);
        if (isAuthenticated) {
            return "redirect:/home";
        }

        redirectAttributes.addFlashAttribute("error", "Invalid userId or password");
        return "redirect:/login";
    }

    @PostMapping("/logout")
    public String logout() {
        authService.logout();
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home() {
        return "index.html";
    }
}
