package com.hcl.dbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.dbank.model.Publish;

@Repository
public interface PublishRepository extends JpaRepository<Publish,Long> {

}
