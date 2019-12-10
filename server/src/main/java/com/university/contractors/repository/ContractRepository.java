package com.university.contractors.repository;

import com.university.contractors.model.Contract;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ContractRepository extends CrudRepository<Contract, Long> {

    Optional<List<Contract>> findByStudentId(Long studentId);
}
