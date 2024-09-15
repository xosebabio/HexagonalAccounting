package com.ojalineiro.accounting.domain.ports.in.member;

import com.ojalineiro.accounting.domain.models.Member;

public interface CreateMemberUseCase {
    Member createMember(Member member);
}
