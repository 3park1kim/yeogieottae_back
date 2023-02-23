package com.yeogieottae.entity;

import com.yeogieottae.entity.bookmark.MemberBookmark;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member extends BaseEntity {

    @Id
    @Column(name="member_id")
    private String id;

    private String username;
    private String mail;
    private String kakaoId;

    @OneToMany(mappedBy = "member")
    private List<Group> groups = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberGroup> memberGroups = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberBookmark> memberBookmarks = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Alert> alerts = new ArrayList<>();
}
