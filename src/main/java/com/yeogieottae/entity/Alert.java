package com.yeogieottae.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Alert {

    @Id @GeneratedValue
    @Column(name = "alert_id")
    private Long id;

    private String msg;
    @Column(name = "to_user")
    private String toUSer;
    private LocalDateTime msgTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
