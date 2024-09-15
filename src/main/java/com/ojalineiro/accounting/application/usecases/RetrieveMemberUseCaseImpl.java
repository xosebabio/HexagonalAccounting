package com.ojalineiro.accounting.application.usecases;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.domain.ports.in.member.RetrieveMemberUseCase;
import com.ojalineiro.accounting.domain.ports.out.MemberRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RetrieveMemberUseCaseImpl implements RetrieveMemberUseCase {

    private final MemberRepositoryPort memberRepositoryPort;

    @Override
    public Optional<Member> getMember(long id) {
        return memberRepositoryPort.findById(id);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepositoryPort.findAll();
    }
}
