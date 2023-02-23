package com.yeogieottae.entity.bookmark;

import com.yeogieottae.entity.Group;

import javax.persistence.*;

@Entity
@DiscriminatorValue("GROUP")
public class GroupBookmark extends Bookmark {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;
}
