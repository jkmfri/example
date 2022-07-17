package jkm.example.service

import jkm.example.dto.MemberJoinDto
import jkm.example.entity.Member
import jkm.example.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberManagementService(
    val memberRepository: MemberRepository
){
    fun join(memberJoinDto: MemberJoinDto){
        val member = memberRepository.save(Member(memberJoinDto.name, memberJoinDto.email))
        println("member id : ${member.id}")
    }
}
