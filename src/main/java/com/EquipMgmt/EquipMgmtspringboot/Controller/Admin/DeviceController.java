package com.EquipMgmt.EquipMgmtspringboot.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/device")
public class DeviceController {
    @GetMapping
    public String index() {
        return  "admin/device/list";
    }

    @GetMapping("/create")
    public String create() {
        return  "admin/device/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return  "admin/device/edit";
    }
}