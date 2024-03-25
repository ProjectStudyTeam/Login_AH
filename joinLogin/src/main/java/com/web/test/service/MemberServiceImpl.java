package com.web.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.test.Repository.MemberRepository;
import com.web.test.domain.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberRepository mRepo;

	@Override
	public int createMember(Member member) {
		Member savedMember = mRepo.save(member);
		if(savedMember != null) {
			return 1;
		}
		return 0;
	}

}
