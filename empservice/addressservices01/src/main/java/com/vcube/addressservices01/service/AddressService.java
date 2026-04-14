package com.vcube.addressservices01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.addressservices01.model.Address;
import com.vcube.addressservices01.repo.AddressRepo;

@Service
public class AddressService {

	@Autowired
	AddressRepo addressRepo;

	public Address findAddress(Integer id) {

		return addressRepo.findAddressByEmployeeId(id).orElse(null);
		
//		return addressRepo.findById(id).orElse(null);

	}

}
