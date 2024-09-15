package com.ojalineiro.accounting.infrastructure.repositories;

import com.ojalineiro.accounting.infrastructure.entities.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemberRepository extends JpaRepository<MemberEntity, Long> {
}
