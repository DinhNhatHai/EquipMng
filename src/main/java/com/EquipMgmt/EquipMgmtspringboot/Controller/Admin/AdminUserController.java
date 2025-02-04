package com.EquipMgmt.EquipMgmtspringboot.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/users")
public class AdminUserController {
    @GetMapping
    public String index() {
        return  "admin/users/list";
    }

    @GetMapping("/create")
    public String create() {
        return  "admin/users/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return  "admin/users/edit";
    }
}