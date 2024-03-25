package com.web.test.Repository;

import org.springframework.data.repository.CrudRepository;

import com.web.test.domain.Member;

public interface MemberRepository extends CrudRepository<Member, Long>{
	
}
