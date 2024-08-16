package hello.core.member;

public class MemberServiceInpl implements MemberService{

    private  final MemberRepository memberRepository;

    public MemberServiceInpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    private final MemberRepository meberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        meberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return meberRepository.findById(memberId);
    }
}
