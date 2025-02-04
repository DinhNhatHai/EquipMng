package com.EquipMgmt.EquipMgmtspringboot.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/department")
public class DepartmentController {
    @GetMapping
    public String index() {
        return  "admin/department/list";
    }

    @GetMapping("/create")
    public String create() {
        return  "admin/department/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return  "admin/department/edit";
    }
}
