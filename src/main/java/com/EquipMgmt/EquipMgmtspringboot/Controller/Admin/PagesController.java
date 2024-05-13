package com.EquipMgmt.EquipMgmtspringboot.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/pages")
public class PagesController {
    @GetMapping
    public String index() {
        return  "admin/pages/list";
    }

    @GetMapping("/create")
    public String create() {
        return  "admin/pages/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return  "admin/pages/edit";
    }
}
