package org.superbiz.struts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController (UserService userService) {
        this.userService=userService;
    }

    @GetMapping("/addUser")
    public String addUserForm() {
        return "addUserForm";
    }

    @PostMapping("/addUser")
    public String addUserPost(User user) {
        add(user);
        return ("/addedUser");
    }

    @GetMapping("/findUser")
    public String addUserForm() {
        return "addUserForm";
    }

    @PostMapping("/addUser")
    public String addUserPost(User user) {
        add(user);
        return ("/addedUser");
    }

    private void add(User user) {
        userService.add(user);
    }
}
