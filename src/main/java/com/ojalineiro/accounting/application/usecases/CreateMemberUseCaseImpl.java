package com.ojalineiro.accounting.application.usecases;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.domain.ports.in.member.CreateMemberUseCase;
import com.ojalineiro.accounting.domain.ports.out.MemberRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateMemberUseCaseImpl implements CreateMemberUseCase {

    private final MemberRepositoryPort memberRepositoryPort;

    @Override
    public Member createMember(Member member) {
        return memberRepositoryPort.save(member);
    }
}
