package com.ojalineiro.accounting.infrastructure.repositories;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.domain.ports.out.MemberRepositoryPort;
import com.ojalineiro.accounting.infrastructure.entities.MemberEntity;
import com.ojalineiro.accounting.infrastructure.mappers.MemberMapper;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class JpaMemberRepositoryAdapter implements MemberRepositoryPort {

    private final JpaMemberRepository jpaMemberRepository;
    private final MemberMapper memberMapper;

    @Override
    public Member save(Member member) {
        MemberEntity memberEntity = memberMapper.toMemberEntity(member);
        MemberEntity savedMemberEntity = jpaMemberRepository.save(memberEntity);
        return memberMapper.toMember(savedMemberEntity);
    }

    @Override
    public Optional<Member> findById(Long id) {
        Optional<MemberEntity> foundMemberEntity = jpaMemberRepository.findById(id);
        if(foundMemberEntity.isPresent())
            return memberMapper.toOptionalMember(jpaMemberRepository.findById(id).get());
        else
            return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }

    @Override
    public Optional<Member> update(Member member) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
