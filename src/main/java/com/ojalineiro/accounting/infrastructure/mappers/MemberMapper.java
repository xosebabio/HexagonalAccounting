package com.ojalineiro.accounting.infrastructure.mappers;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.infrastructure.entities.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    MemberEntity toMemberEntity(Member member);

    Member toMember(MemberEntity memberEntity);

    Optional<Member> toOptionalMember(MemberEntity memberEntity);

    Optional<MemberEntity> toOptionalMemberEntity(Member member);
}
