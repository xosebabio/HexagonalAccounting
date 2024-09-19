package com.ojalineiro.accounting.application.usecases;

import com.ojalineiro.accounting.domain.ports.in.member.DeleteMemberUseCase;
import com.ojalineiro.accounting.domain.ports.out.MemberRepositoryPort;

public class DeleteMemberUseCaseImpl implements DeleteMemberUseCase {

    private final MemberRepositoryPort memberRepositoryPort;

    public DeleteMemberUseCaseImpl(MemberRepositoryPort memberRepositoryPort) {
        this.memberRepositoryPort = memberRepositoryPort;
    }

    @Override
    public boolean deleteMember(long id) {
        return memberRepositoryPort.deleteById(id);
    }
}
