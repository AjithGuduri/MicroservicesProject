package com.vcube.addressservices01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.addressservices01.model.Address;
import com.vcube.addressservices01.service.AddressService;

@RestController
public class AddressController { 	
	@Autowired
	AddressService addressService;

	@GetMapping("/getAddress/{id}")
	Address getAddressInfo(@PathVariable Integer id) {
		return addressService.findAddress(id);

	}

}
