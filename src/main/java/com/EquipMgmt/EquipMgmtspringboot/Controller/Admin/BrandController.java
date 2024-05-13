package com.EquipMgmt.EquipMgmtspringboot.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/brand")
public class BrandController {
    @GetMapping
    public String index() {
        return  "admin/brand/list";
    }

    @GetMapping("/create")
    public String create() {
        return  "admin/brand/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return  "admin/brand/edit";
    }
}
