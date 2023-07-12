package helloJPA;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Member")
public class Member {

    public Member() {
    }

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "USERNAME", nullable = false)
    private String name;
    private Integer age;
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;
//    @Column(name = "TEAM_ID")
//    private Long teamId;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Lob
    private String description;


}
