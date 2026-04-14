package com.vcube.addressservices01.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vcube.addressservices01.model.Address;

@Repository
 
public interface AddressRepo extends JpaRepository<Address, Integer> {

	@Query(nativeQuery = true, value = "SELECT * FROM addressservice WHERE id = :eid")
	Optional<Address> findAddressByEmployeeId(@Param("eid") int eid);
 
}
