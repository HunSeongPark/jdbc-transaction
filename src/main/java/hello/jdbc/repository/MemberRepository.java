package hello.jdbc.repository;

import hello.jdbc.domain.Member;

/**
 * Created by Hunseong on 2022/05/10
 */
public interface MemberRepository {

    Member save(Member member);
    Member findById(String memberId);
    void update(String memberId, int money);
    void delete(String memberId);
}
