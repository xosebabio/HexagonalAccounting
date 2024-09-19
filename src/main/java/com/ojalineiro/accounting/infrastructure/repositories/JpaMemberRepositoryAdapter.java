package com.ojalineiro.accounting.infrastructure.repositories;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.domain.ports.out.MemberRepositoryPort;
import com.ojalineiro.accounting.infrastructure.entities.MemberEntity;
import com.ojalineiro.accounting.infrastructure.mappers.MemberMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaMemberRepositoryAdapter implements MemberRepositoryPort {

    private final JpaMemberRepository jpaMemberRepository;
    private final MemberMapper memberMapper;

    public JpaMemberRepositoryAdapter(JpaMemberRepository jpaMemberRepository, MemberMapper memberMapper) {
        this.jpaMemberRepository = jpaMemberRepository;
        this.memberMapper = memberMapper;
    }

    @Override
    public Member save(Member member) {
        MemberEntity memberEntity = memberMapper.toMemberEntity(member);
        MemberEntity savedMemberEntity = jpaMemberRepository.save(memberEntity);
        return memberMapper.toMember(savedMemberEntity);
    }

    @Override
    public Optional<Member> findById(Long id) {
        return jpaMemberRepository.findById(id)
                .map(memberMapper::toMember);
    }

    @Override
    public List<Member> findAll() {
        return jpaMemberRepository.findAll().stream()
                .map(memberMapper::toMember)
                .toList();
    }

    @Override
    public Optional<Member> update(Member member) {
        if(jpaMemberRepository.existsById(member.getId())){
            MemberEntity memberEntity = memberMapper.toMemberEntity(member);
            MemberEntity updatedMemberEntity = jpaMemberRepository.save(memberEntity);
            return Optional.of(memberMapper.toMember(updatedMemberEntity));
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaMemberRepository.existsById(id)){
            jpaMemberRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
