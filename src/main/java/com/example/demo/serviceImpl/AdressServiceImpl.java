package com.example.demo.serviceImpl;

import com.example.demo.entity.Address;
import com.example.demo.respository.AddressEntityRespository;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressServiceImpl implements AddressService {
    @Autowired
    AddressEntityRespository addressEntityRespository;
    @Override
    public List<Address> getListAddress() {
        return addressEntityRespository.findAll();
    }

    @Override
    public void update(Address address) {
        addressEntityRespository.save(address);
    }

    @Override
    public void insert(Address address) {
        addressEntityRespository.save(address);
    }

    @Override
    public void delete(Long id) {
        addressEntityRespository.deleteById(id);
    }
}
