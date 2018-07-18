package com.example.demo.respository;

import com.example.demo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressEntityRespository extends JpaRepository<Address,Long> {
}
