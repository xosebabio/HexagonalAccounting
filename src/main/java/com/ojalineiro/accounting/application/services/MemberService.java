package com.ojalineiro.accounting.application.services;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.domain.ports.in.member.CreateMemberUseCase;
import com.ojalineiro.accounting.domain.ports.in.member.DeleteMemberUseCase;
import com.ojalineiro.accounting.domain.ports.in.member.RetrieveMemberUseCase;
import com.ojalineiro.accounting.domain.ports.in.member.UpdateMemberUseCase;

import java.util.List;
import java.util.Optional;

public class MemberService implements CreateMemberUseCase, UpdateMemberUseCase, DeleteMemberUseCase, RetrieveMemberUseCase {

    private final CreateMemberUseCase createMemberUseCase;
    private final RetrieveMemberUseCase retrieveMemberUseCase;
    private final DeleteMemberUseCase deleteMemberUseCase;
    private final UpdateMemberUseCase updateMemberUseCase;

    public MemberService(CreateMemberUseCase createMemberUseCase, RetrieveMemberUseCase retrieveMemberUseCase, DeleteMemberUseCase deleteMemberUseCase, UpdateMemberUseCase updateMemberUseCase) {
        this.createMemberUseCase = createMemberUseCase;
        this.retrieveMemberUseCase = retrieveMemberUseCase;
        this.deleteMemberUseCase = deleteMemberUseCase;
        this.updateMemberUseCase = updateMemberUseCase;
    }

    @Override
    public Member createMember(Member member) {
        return createMemberUseCase.createMember(member);
    }

    @Override
    public boolean deleteMember(long id) {
        return deleteMemberUseCase.deleteMember(id);
    }

    @Override
    public Optional<Member> getMember(long id) {
        return retrieveMemberUseCase.getMember(id);
    }

    @Override
    public List<Member> getAllMembers() {
        return retrieveMemberUseCase.getAllMembers();
    }

    @Override
    public Optional<Member> updateMember(Long id, Member member) {
        return updateMemberUseCase.updateMember(id, member);
    }
}
