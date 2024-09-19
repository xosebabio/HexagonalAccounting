package com.ojalineiro.accounting.infrastructure.mappers;

import com.ojalineiro.accounting.domain.models.Member;
import com.ojalineiro.accounting.infrastructure.entities.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    @Mapping(source = "id", target = "id")  // Maps id
    @Mapping(source = "name", target = "name")  // Maps name
    @Mapping(source = "surname", target = "surname")  // Maps surname
    @Mapping(source = "cardIdNumber", target = "cardIdNumber")  // Maps cardIdNumber
    @Mapping(source = "createdAt", target = "createdAt")  // Maps createdAt
    @Mapping(source = "paid", target = "paid")  // Maps paid
    MemberEntity toMemberEntity(Member member);

    @Mapping(source = "id", target = "id")  // Maps id
    @Mapping(source = "name", target = "name")  // Maps name
    @Mapping(source = "surname", target = "surname")  // Maps surname
    @Mapping(source = "cardIdNumber", target = "cardIdNumber")  // Maps cardIdNumber
    @Mapping(source = "createdAt", target = "createdAt")  // Maps createdAt
    @Mapping(source = "paid", target = "paid")  // Maps paid
    Member toMember(MemberEntity memberEntity);
}
