package com.ojalineiro.accounting.infrastructure.config;

import com.ojalineiro.accounting.application.services.MemberService;
import com.ojalineiro.accounting.application.usecases.CreateMemberUseCaseImpl;
import com.ojalineiro.accounting.application.usecases.DeleteMemberUseCaseImpl;
import com.ojalineiro.accounting.application.usecases.RetrieveMemberUseCaseImpl;
import com.ojalineiro.accounting.application.usecases.UpdateMemberUseCaseImpl;
import com.ojalineiro.accounting.domain.ports.out.MemberRepositoryPort;
import com.ojalineiro.accounting.infrastructure.mappers.MemberMapper;
import com.ojalineiro.accounting.infrastructure.repositories.JpaMemberRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MemberService memberService(MemberRepositoryPort memberRepositoryPort){
        return new MemberService(
                new CreateMemberUseCaseImpl(memberRepositoryPort),
                new RetrieveMemberUseCaseImpl(memberRepositoryPort),
                new DeleteMemberUseCaseImpl(memberRepositoryPort),
                new UpdateMemberUseCaseImpl(memberRepositoryPort)
        );
    }

    @Bean
    public MemberRepositoryPort memberRepositoryPort(JpaMemberRepositoryAdapter jpaMemberRepositoryAdapter){
        return jpaMemberRepositoryAdapter;
    }

    @Bean
    public MemberMapper memberMapper(){
        return MemberMapper.INSTANCE;
    }
}
