package com.bve.restapi3.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {
}
