package com.hcl.dbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.dbank.model.Publish;

@Repository
public interface PublishRepository extends JpaRepository<Publish,Long> {
	
	@Query(value="select * from publish order by p_id desc limit 1",nativeQuery=true)
	public Publish viewPublish();
	
	@Query(value="SELECT YEAR(date) AS years, MONTH(date) AS months, COUNT(DISTINCT p_id) as totalCount FROM publish GROUP BY years, months",nativeQuery=true)
	public Object[] getReportByMonth();

}
