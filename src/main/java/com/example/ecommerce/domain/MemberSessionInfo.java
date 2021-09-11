package com.example.ecommerce.domain;


import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "member_session_info")
public class MemberSessionInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "logout_date")
    @Temporal(TemporalType.DATE)
    private Date logoutDate;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate = Date.from(Instant.now());

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        createdDate = createdDate;
    }
}
