package com.web.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.test.domain.Member;
import com.web.test.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	public MemberService memberService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("joinForm")
	public String joinPage() {
		return "join";
	}
	
	@PostMapping("join")
	public String join(Member member) {
		int result = memberService.createMember(member);
		if(result ==1) {
			return "joinSuccess";			
		}
		return "redirect:joinForm";
	}
}
