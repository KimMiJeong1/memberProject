package com.hk.member.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hk.member.vo.Member;

@Repository
public interface MemberMapper {

	public List<Member> memberList();
}
