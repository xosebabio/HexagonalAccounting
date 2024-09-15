package com.ojalineiro.accounting.domain.ports.in.member;

import com.ojalineiro.accounting.domain.models.Member;

import java.util.Optional;

public interface UpdateMemberUseCase {
    Optional<Member> updateMember(Long id, Member member);
}
