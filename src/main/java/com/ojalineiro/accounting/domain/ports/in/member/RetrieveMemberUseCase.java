package com.ojalineiro.accounting.domain.ports.in.member;

import com.ojalineiro.accounting.domain.models.Member;

import java.util.List;
import java.util.Optional;

public interface RetrieveMemberUseCase {
    Optional<Member> getMember(long id);
    List<Member> getAllMembers();
}
