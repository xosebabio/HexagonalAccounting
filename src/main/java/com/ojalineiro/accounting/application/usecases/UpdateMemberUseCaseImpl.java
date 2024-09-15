package com.ojalineiro.accounting.application.usecases;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.domain.ports.in.member.UpdateMemberUseCase;
import com.ojalineiro.accounting.domain.ports.out.MemberRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class UpdateMemberUseCaseImpl implements UpdateMemberUseCase {

    private final MemberRepositoryPort memberRepositoryPort;

    @Override
    public Optional<Member> updateMember(Long id, Member member) {
        return memberRepositoryPort.update(member);
    }
}
