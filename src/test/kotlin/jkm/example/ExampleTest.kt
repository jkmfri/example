package jkm.example

import jkm.example.dto.MemberJoinDto
import jkm.example.entity.Member
import jkm.example.repository.MemberRepository
import jkm.example.service.MemberManagementService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ExampleTest {
    @Autowired
    lateinit var memberManagementService: MemberManagementService

    @Autowired
    lateinit var memberRepository: MemberRepository

    @Test
    fun testA() {
        memberManagementService.join(MemberJoinDto("test", "test@mail.com"))
    }
}