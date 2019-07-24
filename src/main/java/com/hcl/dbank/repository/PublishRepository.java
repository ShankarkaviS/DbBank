package com.hcl.dbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.dbank.model.Publish;

@Repository
public interface PublishRepository extends JpaRepository<Publish,Long> {
	
	@Query(value="select * from publish order by p_id desc limit 1",nativeQuery=true)
	public Publish viewPublish();
	

}
