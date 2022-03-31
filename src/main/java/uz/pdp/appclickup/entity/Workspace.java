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
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name", "owner_id"})})
public class Workspace extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User owner;

    @Column(nullable = false)
    private String initialLetter;

    @OneToOne(fetch = FetchType.LAZY)
    private Attachment avatar;

}
