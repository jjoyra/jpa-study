package helloJPA;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Member")
public class Member {

    public Member() {
    }

    @Id
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Lob
    private String description;


}
