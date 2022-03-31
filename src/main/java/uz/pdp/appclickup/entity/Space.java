package uz.pdp.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickup.entity.template.AbsLongEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name","owner_id"})})
public class Space extends AbsLongEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String initialLetter;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Workspace workspace;

    @OneToOne(fetch = FetchType.LAZY)
    private Icon icon;

    @OneToOne(fetch = FetchType.LAZY)
    private Attachment avatar;

    @ManyToOne(fetch = FetchType.LAZY)
    private User owner;

    @Column(nullable = false)
    private boolean accessType;

}
