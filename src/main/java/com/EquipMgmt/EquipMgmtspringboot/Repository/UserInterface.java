package com.EquipMgmt.EquipMgmtspringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EquipMgmt.EquipMgmtspringboot.Model.User;

public interface UserInterface extends JpaRepository<User, Long> {

}
