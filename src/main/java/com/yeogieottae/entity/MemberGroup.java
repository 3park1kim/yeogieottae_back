package com.yeogieottae.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class MemberGroup extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "member_group_id")
    private Long id;

    private Boolean accept;
    private LocalDateTime acceptTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;
}
