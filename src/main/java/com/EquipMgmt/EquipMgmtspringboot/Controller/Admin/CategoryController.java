package com.EquipMgmt.EquipMgmtspringboot.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {
    @GetMapping
    public String index() {
        return  "admin/category/list";
    }

    @GetMapping("/create")
    public String create() {
        return  "admin/category/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return  "admin/category/edit";
    }
}
