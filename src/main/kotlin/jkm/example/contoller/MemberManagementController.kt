package jkm.example.contoller

import jkm.example.dto.MemberJoinDto
import jkm.example.service.MemberManagementService
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberManagementController(
    val memberManagementService: MemberManagementService
){
    fun join(memberJoinDto: MemberJoinDto){
        memberManagementService.join(memberJoinDto)
    }
}