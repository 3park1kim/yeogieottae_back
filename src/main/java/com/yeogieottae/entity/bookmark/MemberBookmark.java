package com.yeogieottae.entity.bookmark;

import com.yeogieottae.entity.Group;
import com.yeogieottae.entity.Member;

import javax.persistence.*;

@Entity
@DiscriminatorValue("MEMBER")
public class MemberBookmark extends Bookmark {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
