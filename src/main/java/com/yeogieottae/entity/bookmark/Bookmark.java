package com.yeogieottae.entity.bookmark;

import com.yeogieottae.entity.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
@Getter
public class Bookmark extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "bookmark_id")
    private Long id;

    private String storeId;
    private Float x;
    private Float y;
}
