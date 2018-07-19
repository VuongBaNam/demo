package com.example.demo.service;

import com.example.demo.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getListAddress();

    void update(Address address);

    void insert(Address address);

    void delete(Long id);
}
