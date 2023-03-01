package com.yeogieottae.entity;

import com.yeogieottae.entity.bookmark.GroupBookmark;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "GROUPS")
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "group_id")
    private Long id;
    private String groupName;
    private String groupColor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Member member;

    @OneToMany(mappedBy = "group")
    private List<MemberGroup> memberGroups = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<GroupBookmark> groupBookmarks = new ArrayList<>();
}
