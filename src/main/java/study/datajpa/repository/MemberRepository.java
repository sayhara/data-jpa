package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    
    List<Member> findByUsername(String username); // 이처럼 특화된 정보는 커스텀 작업필요
}
